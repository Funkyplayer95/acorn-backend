<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>반복문</title>
<script type="text/javascript">
	function showValue() {
		var val = Number.MIN_VALUE;
		document.getElementById('message').innerHTML = val;
	}
</script>
</head>
<body>
<form>
<input type="button" value="누르기" onclick="showValue()" />
</form>
<p id="message"></p>
</body>
</html>