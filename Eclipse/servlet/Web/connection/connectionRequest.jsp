<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>접속요청</title>
</head>
<body>
	<form action="/servlet/CanLogin" method="GET">
		<h3>
		아이디 : <input type="text" name="id"/>
		<br>
		패스워드 : <input type="password" name="password"/></h3>
		<input type="hidden" name="conncount" value = "51">
		<br>
		<input type="submit" value="로그인">
	</form>
</body>
</html>