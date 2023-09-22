<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>연결정보 표시</title>
</head>
<body>
	<h3>JSP 빌트인 개체 사용</h3>
	요청사용자 아이디: <%= request.getParameter("id")%>
	요청사용자 패스워드: <%= request.getParameter("password")%>
</body>
</html>