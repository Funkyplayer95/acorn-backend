package com.jinbay.myapp.stockinfo.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;

import com.jinbay.myapp.login.utils.ServletForward;
import com.jinbay.myapp.stockinfo.service.StockInfoFullService;

@RequestMapping("/stockinfo4")
public class StockInfoFullController extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// 0.문자셋 설정
		req.setCharacterEncoding("UTF-8");
		// 1.사용자 입력처리
		String sCode = req.getParameter("rawmaterialcode");
		String sSoloCode = req.getParameter("little_full");
		// 2.데이터베이스 - 서비스코드
		new StockInfoFullService().stockInfoFull(req, sCode, sSoloCode);
		// 3.JSP 페이지 호출
		new ServletForward().pageForward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}

}
