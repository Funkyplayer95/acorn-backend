<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Cofirmed</title>
</head>
<body>
	<form action="student-respcheckbox.jsp">
		First name: <input type="text" name="firstName">
		<br />
		Last name: <input type="text" name="lastName">
		<br />
		<input type="checkbox" name="favoriteLanguage" value="Java">Java 
		<input type="checkbox" name="favoriteLanguage" value="C#">C#
		<input type="checkbox" name="favoriteLanguage" value="PHP">PHP
		<input type="checkbox" name="favoriteLanguage" value="Python">Python
		<br />
		<input type="submit" value="전송">
	</form>

</body>
</html>
