package com.blueyonder.shopservice.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.blueyonder.shopservice.entities.Product;

import com.blueyonder.shopservice.exceptions.ProductNotFoundException;
import com.blueyonder.shopservice.repositories.ProductRepository;

public class ProductServiceImpl implements ProductService {
	@Autowired
	private ProductRepository ProductRepo;
	@Override
	public Product addProduct(Product Product) {
		return ProductRepo.save(Product);
	}

	@Override
	public Product getProductById(Integer ProductId) throws ProductNotFoundException {
		Optional<Product> Product = ProductRepo.findById(ProductId);
		if (Product.isPresent()) {
			return Product.get();
		} else {
			throw new ProductNotFoundException();
		}
	}

	@Override
	public Product updateProduct(Product Product) throws ProductNotFoundException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String deleteProduct(Product Product) throws ProductNotFoundException {
		// TODO Auto-generated method stub
		return null;
}

	
	
}
