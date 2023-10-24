package com.acorn.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.acorn.hunter.dto.HunterTabDto;
import com.acorn.hunter.service.HunterInfoService;
import com.acorn.util.ServletForward;

@WebServlet("/gethunterinfo")
public class HunterGameController 
	extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, 
			HttpServletResponse resp) 
				throws ServletException, IOException {
		String sType = req.getParameter("actor");
		String sTypeName = "";
		
		if(sType.equalsIgnoreCase("1")) {
			sTypeName = "궁병";
		} else if(sType.equalsIgnoreCase("2")) {
			sTypeName = "창병";
		} else if(sType.equalsIgnoreCase("3")) {
			sTypeName = "보병";
		} else {
			sType = "1";
			sTypeName = "보병";			
		}
		
		String rtnPage = "/game/hunterInfo.jsp";
		
		List<HunterTabDto> huntList = 
				new HunterInfoService()
				.getHunterInfo(Integer.parseInt(sType));
		
		new ServletForward()
		.pageForward(req, resp, 
				sTypeName, huntList, rtnPage);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, 
			HttpServletResponse resp) 
				throws ServletException, IOException {
		doGet(req, resp);
	}
}
