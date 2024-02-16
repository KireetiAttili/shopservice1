package com.blueyonder.shopservice.service;

import com.blueyonder.shopservice.entities.Product;
import com.blueyonder.shopservice.exceptions.ProductNotFoundException;

public interface ProductService {


		//Create
		public Product addProduct(Product Products);

		//Retrieve
		public Product getProductById(Integer ProductId)throws ProductNotFoundException;
		
		//Update 
		public Product updateProduct(Product Products)throws ProductNotFoundException;

		//Delete	
		public String deleteProduct(Product Products)throws ProductNotFoundException;
}
