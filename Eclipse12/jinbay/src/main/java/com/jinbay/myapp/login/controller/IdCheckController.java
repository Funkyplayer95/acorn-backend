package com.jinbay.myapp.login.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jinbay.myapp.login.dao.IdCheckDao;
import com.jinbay.myapp.login.service.IdCheckService;
import com.jinbay.myapp.login.utils.ServletForward;


@RequestMapping("/idcheck")
@Controller
public class IdCheckController extends HttpServlet {
	
	public IdCheckController() {super();}

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String id = req.getParameter("id");
		
		boolean idCheck = IdCheckDao.IdCheck(id);
		
		new IdCheckService().IdCheck(id, idCheck, req);
		
		new ServletForward().pageForward(req, resp);

	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
	
}
