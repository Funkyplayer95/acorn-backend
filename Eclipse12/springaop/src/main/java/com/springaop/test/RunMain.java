package com.springaop.test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.springaop.ProductService;

public class RunMain {

	private static ClassPathXmlApplicationContext ctx = null;
	
	public static void main(String[] args) {
		ctx = new ClassPathXmlApplicationContext("classpath:/com/springaop/test/config.xml");
		
		ProductService productService = 
				(ProductService)ctx.getBean("productService");
		
		productService.multiply(102, 302);
		
		ctx.close();

	}

}
