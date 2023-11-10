package com.spring.boot.web.jpa.test.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.boot.web.jpa.test.dto.ProductDto;
import com.spring.boot.web.jpa.test.entity.Product;
import com.spring.boot.web.jpa.test.service.ProductService;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class ProductController {
	
	private final ProductService productService;
	
	@GetMapping(value = "/findById")
	public String findById(@RequestParam("id") String id,
			ModelMap modelMap)
	{
		ProductDto productDto = productService.findById(Integer.valueOf(id));
		
		modelMap.addAttribute("product", productDto);
		
		return "productOneView";
	}
	
	@GetMapping(value = "/findall")
	public String findAll(ModelMap modelMap)
	{
		List<ProductDto> productDtoList = productService.findAll();
		
		modelMap.addAttribute("productlist", productDtoList);
		
		return "productMultiView";
	}
	
	@GetMapping(value = "/save")
	public String findById(@RequestParam("id") String id,
			@RequestParam("name") String name, 
			@RequestParam("desc") String description,
			@RequestParam("price") String price,
			ModelMap modelMap)
	{
		Product product = new Product();
		product.setId(Integer.valueOf(id));
		product.setName(name);
		product.setDescription(description);
		product.setPrice(Float.valueOf(price));
		Product retProduct = productService.save(product);
		
		if(retProduct != null) {
			modelMap.addAttribute("product", retProduct);	
			modelMap.addAttribute("msg", "데이터베이스 입력 성공");
		} else {
			modelMap.addAttribute("msg", "데이터베이스 입력 실패");
		}
		
		return "productOneSave";
	}	
	
}