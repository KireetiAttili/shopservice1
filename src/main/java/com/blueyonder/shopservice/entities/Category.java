package com.blueyonder.shopservice.entities;

import java.util.Set;

import com.fasterxml.jackson.annotation.JsonBackReference;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.ToString.Exclude;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "category_info")
public class Category {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer categoryId;
	private String categoryDescr;
	/**
	 * @JsonManagedReference
	 * @ManyToMany(fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST,
	 *                   CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH
	 *                   })
	 * @JoinTable(name = "product_join_category", joinColumns = @JoinColumn(name =
	 *                 "project_id"), inverseJoinColumns = @JoinColumn(name =
	 *                 "category_id"))
	 * 
	 * 
	 *                 private Set<Product>prodList;
	 */
	
	@JsonBackReference
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "product_join_category", joinColumns = @JoinColumn(name = "project_id"), inverseJoinColumns = @JoinColumn(name = "category_id"))

	@Exclude
	private Set<Product> prodList;
}
