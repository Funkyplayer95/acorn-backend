<%@page import="servlet.MakeItLower"%>
<%@page import="servlet.Utils"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Hello</title>
</head>
<body>
	Lower case "Hello World": 
	<%= new MakeItLower().makeItLower("JAVA CLASS") %>
</body>
</html>