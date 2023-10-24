package com.jinbay.myapp.sales.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jinbay.myapp.sales.service.EditInsaleService;

@RequestMapping("/alertInsale")
@Controller
public class AlertInsalesController  extends HttpServlet{
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		// 0. 문자셋 설정
		req.setCharacterEncoding("UTF-8");
		
		// 요청 매개변수로부터 값을 가져옵니다
        String goodsCode = req.getParameter("goodsCode");
        String insales = req.getParameter("insales");
		
        System.out.println(goodsCode);
        System.out.println(insales);
        
		// 2. 데이터 베이스 - 서비스코드
		new EditInsaleService().InsertInsale(req, goodsCode, insales);	
		
		// 3. JSP 페이지 호출 (변경사항을 나타내주기 위해 리다이렉트함)
		resp.sendRedirect("/ordersales/insaleList"); 
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}
