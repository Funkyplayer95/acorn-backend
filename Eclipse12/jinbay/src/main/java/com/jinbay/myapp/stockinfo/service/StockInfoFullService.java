package com.jinbay.myapp.stockinfo.service;

import java.sql.SQLException;

import javax.servlet.http.HttpServletRequest;

import com.jinbay.myapp.stockinfo.dao.StockInfoFullDao;

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
