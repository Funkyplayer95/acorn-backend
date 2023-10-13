<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>TEST</title>
</head>
<body>
<!--  + - * / ++ -- % -->
<script type="text/javascript">
	
		a = 33;
		b = 10;
		c = 'test';
		result = a + b;
		document.write("a+b:" + result + "<br/>");
		
		result = a - b;
		document.write("a-b:" + result + "<br/>");
		
		result = a * b;
		document.write("a*b:" + result + "<br/>");
		
		result = a/b;
		document.write("a/b:" + result + "<br/>");
		
		result = a%b;
		document.write("a%b:" + result + "<br/>");
		
		result = ++a;
		document.write("a++:" + result + "<br/>");
		
		result = --b;
		document.write("b--:" + result + "<br/>");
		
		result = a + b + c; 
		document.write("a + b + c:" + result + "<br/>");

</script>

<p>자바스크립트 산술연산 테스트</p>

</body>
</html>