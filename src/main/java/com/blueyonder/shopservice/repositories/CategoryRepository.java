package com.blueyonder.shopservice.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.blueyonder.shopservice.entities.Category;
@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {
	//public List<Category> findByCategoryName(String categoryName);
	public List<Category> findById(int categoryId);
}
