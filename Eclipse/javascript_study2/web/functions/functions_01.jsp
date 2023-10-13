<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>반복문</title>
<script type="text/javascript">
	function sayHello(name, age) {
		document.write(name + " is " + age + " years old.");
	} 
</script>
</head>
<body>
<p>클릭 전</p>
<form>
	<input type="button" onClick="sayHello('김형태', 20)"  value="안녕">
</form>
<p>클릭 후</p>
</body>
</html>