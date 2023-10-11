package com.team.ordersales.stockinfo.service;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

import com.team.ordersales.stockinfo.dao.StockInfoFullDao;

public class StockInfoOneFullService {

	public void stockInfoOneFull(HttpServletRequest req) {
		try {
			ResultSet full = StockInfoFullDao.getStockqtyFull();
			req.setAttribute("stockinfo3", full);
			req.setAttribute("pageurl", "/views/stockinfo/stockinfolookup.jsp");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

}
