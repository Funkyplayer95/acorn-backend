package com.jinbay.myapp.sales.service;

import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.jinbay.myapp.order.dto.IdentifyInsalesDto;
import com.jinbay.myapp.sales.dao.InsalesDao;


public class ViewInsalesListService {
	
	public void ViewInsaleList(HttpServletRequest req) {
//		InsalesDao.getsaleList();
		List<IdentifyInsalesDto> lala = InsalesDao.getsaleList();
		req.setAttribute("insalelist", lala);
		req.setAttribute("pageurl", 
				"/views/Admin/insale/listInsales.jsp");

	}
}
