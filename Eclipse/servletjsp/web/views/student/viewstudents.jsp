<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>학생테이블</title>
</head>
<body>
	<h2>학생 정보</h2>
	<hr>
	<table border="1">
			<tr>
				<th>이름</th>
				<th>구분</th>
			</tr>
		<c:forEach var="student" items="${students}">
			<tr>
			<td>${student.sName}</td>
			<td>${student.sRegionType}</td>
		</c:forEach>
	</table>
	
</body>
</html>