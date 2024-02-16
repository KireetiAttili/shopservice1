package com.blueyonder.shopservice.service;



import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.blueyonder.shopservice.entities.Category;
import com.blueyonder.shopservice.exceptions.CategoryNotFoundException;
import com.blueyonder.shopservice.repositories.CategoryRepository;

@Service
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	private CategoryRepository catRepo;

	@Override
	public Category addCategory(Category Category) {

		return catRepo.save(Category);
	}




	@Override
	public Category updateCategory(Integer id,String newDescription) throws CategoryNotFoundException {
		Optional<Category> optionalCategory = catRepo.findById(id);

		 if (optionalCategory.isPresent()) {
	            Category category = optionalCategory.get();
	            category.setCategoryDescr(newDescription); // Assuming you have a setter method for CategoryDescription
	            return catRepo.save(category);
	        } else {
	            throw new CategoryNotFoundException("Category with ID " + id + " not found");
        }
    }
		 
	

	@Override
	public String deleteCategory(Category Category) throws CategoryNotFoundException {
		if(catRepo.existsById(Category.getCategoryId())) {
			catRepo.delete(Category);
			return "Deleted";
		}else {
			throw new CategoryNotFoundException("Category with Category id "+Category.getCategoryId()+" doesn't exists");
			
		}
	}

	
}