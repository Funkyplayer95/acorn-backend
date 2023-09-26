package com.acorn.student.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.acorn.student.dto.StudentDto;
import com.acorn.student.service.StudentService;

// http://localhost:8090/servjsp/GetStudent
@WebServlet("/GetStudent")
public class GetStudentController extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, 
			HttpServletResponse resp) 
					throws ServletException, IOException {

		List<StudentDto> students = StudentService.getStudents();
		req.setAttribute("students", students);
		// dispatcher 얻기
		RequestDispatcher dispatcher =
				req.getRequestDispatcher("/views/student/viewstudents.jsp");
		
		// jsp 이동		
		dispatcher.forward(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, 
			HttpServletResponse resp) 
					throws ServletException, IOException {
		doGet(req, resp);
	}
}
