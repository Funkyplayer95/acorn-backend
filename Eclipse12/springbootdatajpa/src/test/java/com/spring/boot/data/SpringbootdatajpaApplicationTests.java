package com.spring.boot.data;

import java.util.List;

import javax.persistence.EntityNotFoundException;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import com.spring.boot.data.entities.Product;
import com.spring.boot.data.repos.ProductRepository;

@SpringBootTest
class SpringbootdatajpaApplicationTests {

//	@Test
//	void contextLoads() {
//	}

	@Autowired
	ApplicationContext ctx;
	
	@Test
	void saveProduct() {
		ProductRepository repository = ctx.getBean(ProductRepository.class);
		Product product = null;
		product = new Product();
		product.setId(6);
		product.setName("상품6");
		product.setDescription("상품6");
		product.setPrice(6000);
	
		repository.save(product);
	}
//		
//		// 조건 조회
//		product = repository.findById(1).orElseThrow(EntityNotFoundException::new);
//		System.out.println(product);
//		
//		// 업데이트
//		product.setPrice(3500);
//		repository.save(product);
//		
//		// 전체 조회
//		List<Product> proList = (List<Product>)repository.findAll();
//		for(Product product2 : proList) {
//			System.out.println(product2);
//		}
//		
//		// 삭제
//		repository.deleteById(7);
//	}
	
//	@Test
//	void customJpaProduct() {
//		ProductRepository repository = ctx.getBean(ProductRepository.class);
//
//		List<Product> proList = repository.findByName("상품6");
//		for(Product product3 : proList) {
//			System.out.println(product3);
//		}
//		
//		List<Product> proList2 = repository.findByNameAndPrice("상품6", 6000);
//		for(Product product4 : proList2) {
//			System.out.println(product4);
//		}
//	}
}
