package com.blueyonder.shopservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.blueyonder.shopservice.repositories.ProductRepository;

@RestController
@RequestMapping("/api/product")
public class ProductController {
	  @Autowired
	    private ProductRepository productRepository;


}
