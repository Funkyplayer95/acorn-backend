<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>연결테스트</title>
</head>
<body>
	<form action="/jsp/canlogin2.jsp" method="GET">
		<h3>
		아이디 : <input type="text" name="id"/>
		<br>
		패스워드 : <input type="password" name="password"/>
		<br>
		<input type="submit" value="연결"></h3>
	</form>
</body>
</html>