package com.team.ordersales.sales.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.team.ordersales.sales.service.SearchService;
import com.team.ordersales.utils.InsalesServletForword;

@WebServlet("/search")
public class SearchInsales  extends HttpServlet{
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		// 0. 문자셋 설정
		req.setCharacterEncoding("UTF-8");
		
		// 요청 매개변수로부터 값을 가져옵니다
        String searchField = req.getParameter("searchField");
        String searchText = req.getParameter("searchText");

        System.out.println(searchField);
        System.out.println(searchText);
        
		// 2. 데이터 베이스 - 서비스코드
		new SearchService().SearchInsaleList(req, searchField, searchText);

		// 3. JSP 페이지 호출
		new InsalesServletForword().pageForward(req, resp);
//		resp.sendRedirect("http://localhost:8090/ordersales/search"); 
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}
