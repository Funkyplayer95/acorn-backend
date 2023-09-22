package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// http://localhost:8090/servlet/StudentServlet
@WebServlet("/StudentServlet")
public class StudentServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, 
			HttpServletResponse resp) 
			throws ServletException, IOException {
		String message = "";
		String firstName = req.getParameter("firstName");
		String lastName = req.getParameter("lastName");
		
		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter out = resp.getWriter();
		if( (firstName.equals("")) || (lastName.equals("")) ) {
			message = "이름이나 성 중에 하나가 입력되지 않았습니다.";
		} else {
			message = firstName + " " + lastName;
			message = "학생이 확인되었습니다: 학생이름은: " + message;
		}
		
		out.println(message);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, 
			HttpServletResponse resp) 
					throws ServletException, IOException {
		doGet(req, resp);
	}

}
