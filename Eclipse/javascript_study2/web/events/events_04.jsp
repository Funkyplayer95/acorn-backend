<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>반복문</title>
	<script type="text/javascript">
	function test1() {
		document.getElementById('message').innerHTML = "<h1>블럭클릭</h1>";
	}

	function test2() {
		document.getElementById('message').innerHTML = "<h3>마우스 아웃</h3>";;
	}
	</script>
</head>
<body>
	<p>결과</p>
	<div onmouseover="test1()" onmouseout="test2()" >
		<h2>블럭안</h2>
	</div>
	<p id="message"></p> 
</body>
</html>