<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>반복문</title>
<script type="text/javascript">
	var book = new Object();
	book.subject = "자바스크립트";
	book.author = "김형태"; 
</script>
</head>
<body>
<script type="text/javascript">
	document.write("책이름: " + book.subject + "<br />");
	document.write("책저자:" + book.author);
</script>
</body>
</html>