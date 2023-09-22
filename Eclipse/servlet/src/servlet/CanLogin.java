package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CanLogin")
public class CanLogin extends HttpServlet {

	private static final long serialVersionUID = 1L;
	
	@Override
	protected void doGet(HttpServletRequest req, 
			HttpServletResponse resp) 
					throws ServletException, IOException {
		String message;
		
		req.setCharacterEncoding("UTF-8");	
		String sId = req.getParameter("id");
		int ICount = Integer.valueOf(req.getParameter("conncount"));
		
		ServletContext contex = getServletContext();
		int iCanConnMaxCount = 
				Integer.valueOf(
						contex.getInitParameter("max_connection_count"));
		if(ICount < iCanConnMaxCount) {
			message = sId + "님 접속을 환영합니다.";
		} else {
			message = sId + "님 다음에 다시 접속해 주시기 바랍니다.";
		}
		
		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter out = resp.getWriter();	
		out.println("<html><body>");
		out.println("<h1>");
		out.println(message);
		out.println("</h1>");
		out.println("</html></body>");		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, 
			HttpServletResponse resp) 
					throws ServletException, IOException {
		doGet(req, resp);
	}
}
