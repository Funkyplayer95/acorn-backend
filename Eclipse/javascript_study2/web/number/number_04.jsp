<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>반복문</title>
		<script type="text/javascript">
		function user(name, address) {
			this.name 		= name;
			this.address 	= address;
		}
		</script>
	</head>
	<body>
		<p id="message"></p>
		<script type="text/javascript">
		var myInfo = new user("김형태's 가족", "서울시");
		document.getElementById('message').innerHTML = myInfo.constructor;
		</script>
	</body>
</html>