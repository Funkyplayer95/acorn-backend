package com.team.ordersales.prod.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.team.ordersales.prod.dao.ProductInfoDao;
import com.team.ordersales.prod.entity.ProductInfoEntity;

public class ProductService {
	
	public void productShow(HttpServletRequest req, String sCategory) {
		
		List<ProductInfoEntity> llist = ProductInfoDao.productshow(sCategory);
		
		
		
	}
}
