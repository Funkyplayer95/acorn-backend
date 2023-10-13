<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>반복문</title>
		<script type="text/javascript">
		function deleteCookies() {
			var now = new Date();
			now.setMonth(now.getMonth() -1);
			cookievalue = escape(document.testform.cookiename.value) + ";";
			document.cookie = "name=" + cookievalue;
			document.cookie = " expires=" + now.toUTCString() + ";";
		}
		</script>
	</head>
	<body>
		<form name="testform">
			<input type="text" name="cookiename" /><br />
			<input type="button" value="쿠키읽기" onclick="deleteCookies()" />
		</form>
	<p id="message">테스트</p>
	</body>
</html>