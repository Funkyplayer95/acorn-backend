package com.team.ordersales.stockinfo.service;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

import com.team.ordersales.stockinfo.dao.StockInfoFullDao;

public class StockInfoFullService {

	public void stockInfoFull(HttpServletRequest req, String sCode, String sSoloCode) {
		try {
			StockInfoFullDao.getStockqtyFull(sCode, sSoloCode);
			
			req.setAttribute("pageurl", "/stockinfo");
		} catch (SQLException e) {
			e.printStackTrace();

		}

	}

}
