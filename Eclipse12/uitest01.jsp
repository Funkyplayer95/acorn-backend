<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>UITEST01</title>
</head>
<body>
	<%
		String id = (String)request.getAttribute("id");		
		String passwd = (String)request.getAttribute("passwd");
		Integer salary = (Integer)request.getAttribute("salary");
		out.println("id:" + id + "," + "passwd:" + passwd + "," + "salary:" + salary);
	%>	
</body>
</html>