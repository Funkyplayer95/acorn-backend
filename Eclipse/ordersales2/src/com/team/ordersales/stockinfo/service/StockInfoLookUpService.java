package com.team.ordersales.stockinfo.service;

import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.team.ordersales.stockinfo.dao.StockInfoLookUpDao;
import com.team.ordersales.stockinfo.entity.StockInfoEntity;

public class StockInfoLookUpService {

	public void stockInfoLookUp(HttpServletRequest req) {
		List<StockInfoEntity> rslist = null;
//		System.out.println(1);
		try {
			rslist = StockInfoLookUpDao.getStockInfoList();

			req.setAttribute("stockinfo", rslist);

			req.setAttribute("pageurl", "/views/stockinfo/stockinfolookup.jsp");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
