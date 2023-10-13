<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>반복문</title>
		<script type="text/javascript">
			function confirmTest() {
				var ret = confirm("계속진행을 하시겠습니까?");
				if(ret == true) {
					document.getElementById('message').innerHTML = "GOGO";		
				} else {
					document.getElementById('message').innerHTML = "STOP";
				}
			}
		</script>
	</head>
	<body>
		<form>
		<input type="button" name="alerttest" value="대화창테스트" onclick="confirmTest()"/>
		</form>
		<p id="message"></p>
	</body>
</html>