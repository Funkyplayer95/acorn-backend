package com.acorn.util;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.acorn.hunter.dto.HunterTabDto;

public class ServletForward {
	
	public void pageForward(HttpServletRequest req, 
			HttpServletResponse resp) 
					throws ServletException, IOException {
		// dispatcher 얻기
		RequestDispatcher dispatcher =
				req.getRequestDispatcher(
						req.getAttribute("pageurl")
						.toString()
						);
		req.removeAttribute("pageurl");
		
		// jsp 이동
		dispatcher.forward(req, resp);
	}
	
	public void pageForward(HttpServletRequest req, 
			HttpServletResponse resp, 
			String sTypeName, List<HunterTabDto> huntList, 
			String rtnPage) 
					throws ServletException, IOException {
		req.setAttribute("typename", sTypeName);
		req.setAttribute("huntList", huntList);
		req.setAttribute("rtnPage", rtnPage);
		
		// dispatcher 얻기
		RequestDispatcher dispatcher =
				req.getRequestDispatcher(
						req.getAttribute("rtnPage")
						.toString()
						);
		req.removeAttribute("rtnPage");
		
		// jsp 이동
		dispatcher.forward(req, resp);
	}
}
