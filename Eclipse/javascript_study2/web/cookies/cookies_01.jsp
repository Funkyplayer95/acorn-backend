<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>반복문</title>
		<script type="text/javascript">
		function createCookies() {
			if(document.testform.cookiename.value=="") {
				alert("값을 입력해 주시기 바랍니다.");
				return;
			}
	
			cookievalue = escape(document.testform.cookiename.value) + ";";
			document.cookie = "name=" + cookievalue;
			document.getElementById('message').innerHTML = cookievalue;
		}
		</script>
	</head>
	<body>
		<form name="testform">
			<input type="text" name="cookiename" /><br />
			<input type="button" value="쿠키생성" onclick="createCookies()" />
		</form>
		<p id="message">테스트</p>
	</body>
</html>