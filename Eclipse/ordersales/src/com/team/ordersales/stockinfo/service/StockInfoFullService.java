package com.team.ordersales.stockinfo.service;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

import com.team.ordersales.stockinfo.dao.StockInfoFullDao;

public class StockInfoFullService {

	public void stockInfoFull(HttpServletRequest req) {
		try {
			ResultSet full = StockInfoFullDao.getStockqtyFull();
			System.out.println(8);
			req.setAttribute("stockinfo2", full);
			System.out.println(9);
			// req.setAttribute("pageurl", "/stockinfo/stockinfofull.jsp");
			req.setAttribute("pageurl", "/views/stockinfo/stockinfolookup.jsp");
			System.out.println(10);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

}
