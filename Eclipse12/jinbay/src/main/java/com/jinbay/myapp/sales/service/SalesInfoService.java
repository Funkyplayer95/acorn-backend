package com.jinbay.myapp.sales.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.jinbay.myapp.sales.dao.SalesInfoDao;
import com.jinbay.myapp.sales.entity.SalesInfoEntity;


public class SalesInfoService {

	public void SalesInfoDate(String sParaSD, String sParaED,String sParaST, HttpServletRequest req) {
		List<SalesInfoEntity> lue = SalesInfoDao.getSalesInfoList(sParaSD, sParaED, sParaST);
		// 리스트에 삽입
		req.setAttribute("salesinfolist", lue);
		req.setAttribute("vstartdate", sParaSD);
		req.setAttribute("venddate", sParaED);
		req.setAttribute("vsearchtext", sParaST);
		req.setAttribute("pageurl", "/views/Admin/sales/salesinfo.jsp");
	}
}


