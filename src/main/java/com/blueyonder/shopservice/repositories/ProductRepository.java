package com.blueyonder.shopservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.blueyonder.shopservice.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Integer>{

}
