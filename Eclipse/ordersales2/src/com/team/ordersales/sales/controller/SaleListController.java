package com.team.ordersales.sales.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.team.ordersales.login.service.LoginCheckService;
import com.team.ordersales.login.utils.ServletForward;
import com.team.ordersales.sales.service.InsaleService;

@WebServlet("/salelist")
public class SaleListController  extends HttpServlet{
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		// 2. 데이터 베이스 - 서비스코드
		new InsaleService().InsaleStartPage(req);	
		
		// 3. JSP 페이지 호출
		new ServletForward().pageForward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}
