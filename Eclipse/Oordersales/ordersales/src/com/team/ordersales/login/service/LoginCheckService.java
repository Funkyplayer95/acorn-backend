package com.team.ordersales.login.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.team.ordersales.login.dao.LoginCheckDao;
import com.team.ordersales.login.dao.RetrieveMemberDao;
import com.team.ordersales.login.entity.LoginUserEntity;

public class LoginCheckService {
	
	public void loginCheck(String sParaId, 
			String sParaPasswd,
			HttpServletRequest req) {
		
		if(LoginCheckDao
				.loginCheck(sParaId, sParaPasswd)) {
			List<LoginUserEntity> lue = 
					RetrieveMemberDao.getMemberList(sParaId);
			req.setAttribute("memberlist",lue);
			req.setAttribute("pageurl", 
					"/login/mainpage.jsp");
		} else {
			req.setAttribute("pageurl", 
					"/login/registermember.jsp");
			req.setAttribute("id", sParaId);
			req.setAttribute("passwd", sParaPasswd);
		}
	}
}
