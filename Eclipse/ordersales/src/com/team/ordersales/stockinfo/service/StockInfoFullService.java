package com.team.ordersales.stockinfo.service;

import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

import com.team.ordersales.stockinfo.dao.StockInfoFullDao;

public class StockInfoFullService {

	public void stockInfoFull(HttpServletRequest req) {
		try {
			ResultSet full = StockInfoFullDao.getStockqtyFull();
			req.setAttribute("stockinfo2", full);
			// req.setAttribute("pageurl", "/stockinfo/stockinfofull.jsp");
			req.setAttribute("pageurl", "/views/stockinfo/stockinfolookup.jsp");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

}
