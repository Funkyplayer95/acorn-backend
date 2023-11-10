package com.spring.boot.web.jpa.test.service;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.spring.boot.web.jpa.test.dto.ProductDto;
import com.spring.boot.web.jpa.test.entity.Product;
import com.spring.boot.web.jpa.test.repository.ProductRepository;

import lombok.RequiredArgsConstructor;

@Service
@Transactional
@RequiredArgsConstructor
public class ProductService {

	private final ProductRepository productRepository;
	
	public ProductDto findById(int id) {
		Product product = productRepository.findById(id)
				.orElseThrow(EntityNotFoundException::new);
		
		ProductDto productDto = new 
				ProductDto(product.getId(),
							product.getDescription(),
							product.getName(),
							product.getPrice());
		return productDto;
	}
	
	public List<ProductDto> findAll() {
		List<Product> productList = (List<Product>)productRepository.findAll();
		
		List<ProductDto> proList = new ArrayList<ProductDto>();
		
		for(Product product : productList) {
			ProductDto productDto = new 
				ProductDto(product.getId(),
				product.getDescription(),
				product.getName(),
				product.getPrice());
			proList.add(productDto);
		}

		return proList;
	}
	
	public Product save(Product product) {
		
		Product product2 = productRepository.save(product);
		
		return product2;
	}
}