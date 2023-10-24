<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>  
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>사냥게임</title>
</head>

<body>
	<h3>${typename}</h3>
	<table border="1">
		<tr>
			<th>체력</th>
			<th>공격력</th>
			<th>방어력</th>
			<th>위치</th>
		<c:forEach var="hunter" items="${huntList}">
			<tr>
				<td>${hunter.health}</td>
				<td>${hunter.attackpower}</td>
				<td>${hunter.defencepower}</td>
				<td>(${hunter.x},${hunter.y})</td>
			</tr>
		</c:forEach>
	</table>
</body>

</html>