<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>연결정보 표시</title>
</head>
<body>
	<%
		String sId = request.getParameter("id"); 
		String sPassword = request.getParameter("password");
		String message;
		if( (sId.equals("")) || (sPassword.equals("")) ) {
			message = "아이디나 패스워드 중 하나가 입력되지 않았습니다.";
		} else {
			message = "축하합니다. 접속에 성공하셨습니다.";
		}
		
		out.println("<html><body>");
		out.println("<h4>");
		out.println(message);
		out.println("</h4>");
		out.println("</html></body>");
	%>
</body>
</html>