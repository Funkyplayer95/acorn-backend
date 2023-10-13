<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>반복문</title>
		<script type="text/javascript">
			function promptTest() {
				var name = prompt("당신의 이름: ", "이름은" );
				document.getElementById('message').innerHTML = name;
			}
		</script>
	</head>
	<body>
		<form>
		<input type="button" name="prompttest" value="입력창테스트" onclick="promptTest()"/>
		</form>
		<p id="message"></p>
	</body>
</html>