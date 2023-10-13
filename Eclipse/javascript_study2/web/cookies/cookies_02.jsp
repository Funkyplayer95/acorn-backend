<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>반복문</title>
		<script type="text/javascript">
		function readCookies() {
			allcookies = document.cookie;  // ;로구분된 name=value 집합 name1=value1;name2=value2;
			document.getElementById('message').innerHTML = allcookies;
	
			cookiearray = allcookies.split(';');
			for(i=0; i<cookiearray.length; i++) {
				name = cookiearray[i].split('=')[0];
				value = cookiearray[i].split('=')[1];
				document.getElementById('message').innerHTML = 	name + ":" + value;	
			}
	
		}
		</script>
	</head>
	<body>
		<form name="testform">
			<input type="text" name="cookiename" /><br />
			<input type="button" value="쿠키읽기" onclick="readCookies()" />
		</form>
		<p id="message">테스트</p>
	</body>
</html>