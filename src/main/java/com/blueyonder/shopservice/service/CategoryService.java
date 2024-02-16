package com.blueyonder.shopservice.service;

import java.util.List;
import java.util.Optional;

import com.blueyonder.shopservice.entities.Category;
import com.blueyonder.shopservice.exceptions.CategoryNotFoundException;


public interface CategoryService {
	public Category addCategory(Category category);
	
	//Update 
	public Category updateCategory(Integer id, String newDescription)throws CategoryNotFoundException;

	//Delete	
	public String deleteCategory(Category Category)throws CategoryNotFoundException;
}

