<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>TEST</title>
	<script type="text/javascript">
		myVar = undefined;
		anyVar = undefined;
		myVar = "전역변수1";
		anyVar = "전역변수2";
		function checkscope() {
			myVar = "지역변수";
			alert(myVar);
			alert(anyVar);
		}
	</script>
</head>
<body>
	<input type="button" onClick="checkscope()" value="변수영역체크" /> 
</body>
</html>