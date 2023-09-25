<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Cofirmed</title>
</head>
<body>
	<form action="student-respradiobox.jsp">
		First name : <input type = "text" name="firstName">
		<br />
		Last name : <input type = "text" name="lastName">
		<br />
		Favorite Language
		<input type ="radio" name="favoriteLanguage" value = "Java">Java
		<input type ="radio" name="favoriteLanguage" value = "C#">C#
		<input type ="radio" name="favoriteLanguage" value = "PHP">PHP
		<input type ="radio" name="favoriteLanguage" value = "Ruby">Ruby
		
		<input type ="submit" value="전송">
	</form>

</body>
</html>