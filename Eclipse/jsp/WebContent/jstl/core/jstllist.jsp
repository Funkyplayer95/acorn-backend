<%@ page import="java.util.*" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="jstl.entity.Student" %>

    
<%
	List<Student> data = new ArrayList<Student>();
	data.add(new Student("홍","길동",true));
	data.add(new Student("고","길동",true));
	data.add(new Student("김","길동",false));
	data.add(new Student("강","길동",true));
	data.add(new Student("이","길동",false));
	pageContext.setAttribute("myStudent", data);
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSTL 테스트</title>
</head>
<body>
	<table border="1">
	<tr>
		<th>성</th>
		<th>이름</th>
		<th>금고객</th>
		<c:forEach var="student" items="${myStudent}">
		<tr>
		<td>${student.firstName}</td>
		<td>${student.lastName}</td>
		<td>
		<c:if test = "${student.goldCustomer}">Special discount</c:if>
		<c:if test = "${not student.goldCustomer}">일반</c:if>
		</td>
		</tr>
		</c:forEach>
	</table>
	
</body>
</html>