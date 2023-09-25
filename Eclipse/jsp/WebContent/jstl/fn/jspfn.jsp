<%@ page import="jstl.entity.Student" %>
<%@ page import="java.util.*" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSTL 테스트</title>
</head>
<body>
	<c:set var="data" value="woseven" />
	문자열<b>${data}</b>의 길이 : ${fn:length(data)}
	${fn:startsWith(data,"wo")}
</body>
</html>