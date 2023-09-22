<%@page import="servlet.MakeItLower"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hello</title>
</head>
<body>
 	<%!
 		MakeItLower lower = new MakeItLower();
 	%>
 	
 	Lower case "Hello World" : <%= lower.makeItLower("Hello World") %>
</body>
</html>