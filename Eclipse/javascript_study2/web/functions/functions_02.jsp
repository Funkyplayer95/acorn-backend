<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>반복문</title>
<script type="text/javascript">
function concatValue(first, last) {
	var full;
	full = first + last;
	return full;
}

function callFunc() {
	var result;
	result = concatValue('김형태1', '김형태2');
	alert(result);
}
</script>
</head>
<body>
<p>클릭 전</p>
<form>
	<input type="button" onClick="callFunc()"  value="험수호출">
</form>
<p>클릭 후</p>
</body>
</html>