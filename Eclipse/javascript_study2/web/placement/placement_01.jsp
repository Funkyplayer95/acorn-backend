<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>TEST</title>
	<script type="text/javascript">
		alert("안녕1");
	</script>
</head>
<body>
	<script type="text/javascript">
		alert("안녕2");
	</script>
	<h3>결과</h3>
	<input type="button" onClick="sayHello()" value="안녕" />
	<script type="text/javascript">
		function sayHello() {
			alert("안녕3");	
		}
	</script>
</body>
</html>