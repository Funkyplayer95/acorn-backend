<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>User List</title>
</head>
<body>

<table border="1">
<tr>
<th>성명</th>
</tr>
<c:forEach var="item" items="${list}">
<tr><!-- 첫번째 줄 시작 -->
<td>${item}</td>
</tr><!-- 첫번째 줄 끝 -->
</c:forEach>
<tr>
<th>${sum}</th>
</tr>
</table>
  
</body>
</html>