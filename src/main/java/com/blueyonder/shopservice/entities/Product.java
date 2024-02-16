package com.blueyonder.shopservice.entities;

import java.util.Set;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import lombok.ToString.Exclude;

@Entity
@Table(name = "PRODUCT")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "product_id)")
	private Integer productId;
	@NotBlank(message = "name is mandatrory")
	private String productName;
	@NotBlank(message = "price is mandatrory")
	private Integer productPrice;
	@NotBlank(message = "description is mandatrory")
	private String productDescr;
	/**
	 * @JsonBackReference
	 * @ManyToMany(fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST,
	 *                   CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH
	 *                   })
	 * @JoinTable(name = "product_join_category", joinColumns = @JoinColumn(name =
	 *                 "project_id"), inverseJoinColumns = @JoinColumn(name =
	 *                 "category_id"))
	 * 
	 *                 private Set<Category> catList;
	 */
	@JsonManagedReference
	// @JsonBackReference
	@ManyToMany(fetch = FetchType.LAZY, mappedBy = "prodList")
	@Exclude
	private Set<Category> catList;

}
