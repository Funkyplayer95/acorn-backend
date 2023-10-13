package com.team.ordersales.stockinfo.service;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

import com.team.ordersales.stockinfo.dao.StockInfoFullDao;

public class StockInfoFullService {

	public void stockInfoFull(HttpServletRequest req, String sCode) {
		try {
			 StockInfoFullDao.getStockqtyFull(sCode);
			
			req.setAttribute("pageurl", "/views/Admin/stock/stockinfolookup.jsp");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}


}
