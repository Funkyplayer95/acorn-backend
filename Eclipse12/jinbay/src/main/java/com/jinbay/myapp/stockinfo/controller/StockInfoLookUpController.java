package com.jinbay.myapp.stockinfo.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.bind.annotation.RequestMapping;

import com.jinbay.myapp.login.utils.ServletForward;
import com.jinbay.myapp.stockinfo.service.StockInfoLookUpService;

@RequestMapping("/stockinfo")
public class StockInfoLookUpController extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("UTF-8");

		new StockInfoLookUpService().stockInfoLookUp(req);

		new ServletForward().pageForward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}

}
