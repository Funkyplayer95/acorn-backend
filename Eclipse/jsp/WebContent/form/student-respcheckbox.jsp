<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Cofirmed</title>
</head>
<body>
	The student is confirmed: ${param.lastName} ${param.firstName}
	<% 
		String[] selectedLanguage = 
			request.getParameterValues("favoriteLanguage");
		for(String lang : selectedLanguage) {
			out.println("<li>" + lang  + "</li>");
		}
	%>

</body>
</html>
