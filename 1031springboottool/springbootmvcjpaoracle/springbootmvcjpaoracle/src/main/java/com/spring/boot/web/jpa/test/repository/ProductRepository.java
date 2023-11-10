package com.spring.boot.web.jpa.test.repository;

import org.springframework.data.repository.CrudRepository;

import com.spring.boot.web.jpa.test.entity.Product;

import java.lang.String;
import java.util.List;

public interface ProductRepository 
	extends CrudRepository<Product, Integer> {
	
	List<Product> findByName(String name);
		
	List<Product> findByNameAndPrice(String name, float price);
	
}