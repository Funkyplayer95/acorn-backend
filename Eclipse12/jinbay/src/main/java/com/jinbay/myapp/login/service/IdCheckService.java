package com.jinbay.myapp.login.service;

import javax.servlet.http.HttpServletRequest;

import com.jinbay.myapp.login.dao.IdCheckDao;



public class IdCheckService {

	public void IdCheck(String sParaId, boolean result, HttpServletRequest req) {
		
		req.setAttribute("id", sParaId);
		req.setAttribute("idCheck", result);
		
		if(IdCheckDao.IdCheck(sParaId)) {
			req.setAttribute("pageurl", "/views/login/IdCheckForm.jsp");
		}
		else {
			req.setAttribute("pageurl", "/views/login/IdCheckForm.jsp");
		}
	}
}
