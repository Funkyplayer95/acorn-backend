<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>UIOBJLISTTEST01</title>
</head>
<body>
	<table border="1">
		<tr>
			<th>유저아이디</th>
			<th>유저패스워드</th>
			<th>유저역할</th>
		</tr>
		<c:forEach var="userinfo" items="${userinfolist}">
			<tr>
				<td>${userinfo.userid}</td>
				<td>${userinfo.userpassword}</td>
				<td>${userinfo.role}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>