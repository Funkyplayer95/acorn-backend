package com.jinbay.myapp.login.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.jinbay.myapp.login.dao.LoginCheckDao;
import com.jinbay.myapp.login.dao.RetrieveMemberDao;
import com.jinbay.myapp.login.entity.LoginUserEntity;


public class LoginCheckService {
	
	public void loginCheck(String sParaId, 
			String sParaPasswd,
			HttpServletRequest req) {
		
		if(LoginCheckDao
				.loginCheck(sParaId, sParaPasswd)) {
			List<LoginUserEntity> lue = 
					RetrieveMemberDao.getMemberList(sParaId);
			
			System.out.println(lue);
			
			String role = lue.get(0).getRole();
			
			System.out.println(role);
			
			if(role.equals("a")) {
				req.setAttribute("pageurl", 
						"/views/Admin/adminmenu.jsp");
			}
			else {
				req.setAttribute("pageurl", 
						"/views/User/usermenu.jsp");
			}

		} else {
			req.setAttribute("pageurl", 
					"/views/login/registermember.jsp");
			req.setAttribute("id", sParaId);
		}
	}
}
