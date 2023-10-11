<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>  
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>로그인 결과</title>
</head>

<body>
	<table border="1">
		<tr>
			<th>아이디</th>
			<th>암호</th>
			<th>주소</th>
		<c:forEach var="member" items="${memberlist}">
			<tr>
				<td>${member.id}</td>
				<td>${member.passwd}</td>
				<td>${member.addr}</td>
			</tr>
		</c:forEach>
	</table>
</body>

</html>