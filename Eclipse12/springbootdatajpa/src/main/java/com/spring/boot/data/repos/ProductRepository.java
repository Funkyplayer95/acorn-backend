package com.spring.boot.data.repos;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.spring.boot.data.entities.Product;

public interface ProductRepository 
	extends CrudRepository<Product, Integer>{ //Crud = Create, Reda, Update, Delete

	List<Product> findByName(String name);
	List<Product> findByNameAndPrice(String name, int price);
}
