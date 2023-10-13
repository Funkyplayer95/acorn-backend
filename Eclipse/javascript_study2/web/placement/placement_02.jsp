<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>TEST</title>
	<script type="text/javascript">
		function sayHello() {
			alert('안녕2')
		}
</script>
</head>
<body>
	<script type="text/javascript">
		document.write("Hello World")
	</script>
	<p>
		<input type=button onClick="sayHello()" value="안녕" />
	</p>
</body>
</html>