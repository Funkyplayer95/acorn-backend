package com.jinbay.myapp.login.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jinbay.myapp.login.dto.RegisMemDto;
import com.jinbay.myapp.login.service.RegisMemService;
import com.jinbay.myapp.login.utils.ServletForward;


@RequestMapping("/regimem")
@Controller
public class RegisMemController extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		// 0. 문자셋 설정
		req.setCharacterEncoding("UTF-8");
		
		// 1. 사용자 입력 처리
		String id 		= req.getParameter("id");
		String passwd 	= req.getParameter("passwd");
		String phonenum = req.getParameter("phonenum");
		String role 	= "u";	// 회원가입은 기본으로 사용자만
		String addr 	= req.getParameter("addr");
		
		// 2. 데이터 베이스 - 서비스코드
		new RegisMemService().
		registerMember(
				new RegisMemDto(id, passwd, phonenum, role, addr), req);
	
		// 3. JSP 페이지 호출
		new ServletForward().pageForward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}
