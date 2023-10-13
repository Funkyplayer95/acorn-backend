<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>반복문</title>
<script type="text/javascript">
funcBody = function(x, y) { return x*y; };
function callFunc(num1, num2) {
	result = funcBody(num1, num2);
	document.write(result);
}
</script>
</head>
<body>
<p>클릭 전</p>
<form>
<input type="button" onClick="callFunc(1234, 5678)" value="클릭" />
</form>
<p>클릭 후</p>
</body>
</html>