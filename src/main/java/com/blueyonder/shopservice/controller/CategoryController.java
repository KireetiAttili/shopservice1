package com.blueyonder.shopservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blueyonder.shopservice.entities.Category;
import com.blueyonder.shopservice.exceptions.CategoryNotFoundException;
import com.blueyonder.shopservice.service.CategoryService;

@RestController
@CrossOrigin("*")
@RequestMapping(value="/shoppingservice/api/v1/category",consumes= MediaType.APPLICATION_JSON_VALUE)
public class CategoryController {
	@Autowired
	private CategoryService categoryService;
	
	@PostMapping(value="/addcategory",consumes= MediaType.APPLICATION_JSON_VALUE)
	public Category addCategory(@RequestBody Category category) {
		 return categoryService.addCategory(category);
		 
	}
	@PostMapping("/deletecategory")
	public void deleteCategory(@RequestBody Category category) {
		try {
			categoryService.deleteCategory(category);
		} catch (CategoryNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	@PostMapping("/updatecategory")
	public void updateCategory(@RequestBody Integer id, String descr) {
		try {
			categoryService.updateCategory(id,descr);
		} catch (CategoryNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
