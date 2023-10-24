package com.jinbay.myapp.stockinfo.service;

import java.sql.SQLException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.jinbay.myapp.stockinfo.dao.StockInfoLookUpDao;
import com.jinbay.myapp.stockinfo.entity.StockInfoEntity;

public class StockInfoLookUpService {

	public void stockInfoLookUp(HttpServletRequest req) {
		List<StockInfoEntity> rslist = null;
		try {
			rslist = StockInfoLookUpDao.getStockInfoList();

			req.setAttribute("stockinfo", rslist);

			req.setAttribute("pageurl", "/views/Admin/stock/stockinfolookup.jsp");
//			req.setAttribute("pageurl", "/stockinfo");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
