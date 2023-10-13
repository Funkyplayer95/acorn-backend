package com.team.ordersales.prod.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.team.ordersales.prod.dao.ProductUpdateDao;
import com.team.ordersales.prod.entity.ProductInfoEntity;

public class ProductUpdateService {
	
	public void updateService(HttpServletRequest req, String sGoodsCode, String sCategory) {
		
		List<ProductInfoEntity> llist = ProductUpdateDao.productupdate(sGoodsCode, sCategory);
		
		req.setAttribute("goodsList", llist);
		req.setAttribute("pageurl", "/views/User/electronic/electronic.jsp");
		
	}
}
