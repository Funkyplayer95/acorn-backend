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
	<!--
		a = 8; 
		b = 5;
		c1 = 2;
		c2 = 8;
						
		result = a & b;
		document.write(result + "<br />");
		
		result = a | b;  
		document.write(result + "<br />");
		
		result = (a|b) | c1;
		document.write(result + "<br />");

		result = ((~a) & 15) | c2;
		document.write(result + "<br />");
		
	//-->
</script>

<!-- 
unsigned byte: 0-255
byte: -127---0---127
	0F                      0000 1111 -> 15
	08   0000 1000 -> 8 ~8->1111 0111 F7
	15 & (~8) -> 0000 0111
 -->
<p>자바스크립트 산술연산 테스트</p>

</body>
</html>