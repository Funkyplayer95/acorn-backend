<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>반복문</title>
		<script type="text/javascript">
			function checkAuth() {
				if( (document.testform.id.value == "") ||
					(document.testform.pwd.value == "")	) {
					alert("아이디나 패스워드 모두 입력되어야 합니다.");
					return;
				}
	
				var init_id = 'kht';
				var init_pwd = '123';
				
				var request_id = document.testform.id.value;
				var request_pwd = document.testform.pwd.value;
				
				if(request_id == init_id) {
					if(request_pwd == init_pwd) {
						// 쿠기 생성
						cookieid = escape(document.testform.id.value) + ";";
						cookiepwd = escape(document.testform.pwd.value) + ";";
						document.cookie = "id=" + cookieid + "pwd=" + cookiepwd;
						alert('쿠키를 생성했습니다.')
					} else {
						alert('패스워드가 일치하지 않습니다.');
						return;
					}
				} else {
					alert('존재하지 않는 아이디입니다.');
					return;
				}
			}

			function checkLinkEnable() {
				allcookies = document.cookie;  // id=kht;pwd=123;
				if(allcookies=="") {
					alert('쿠키가 존재하지 않습니다.');
					return;
				} else {
					alert('쿠키가 존재합니다.');
					var linkData = "<a href='http://localhost:8090/javascript_study/15.cookies/cookies_exam_02.jsp' target='_blank'>중요한페이지</a>";
					document.getElementById('link').innerHTML = linkData;
				}
			}
		</script>
	</head>
	<body>
		<form name="testform">
		<input type="text" name="id" /><br /><br />
		<input type="text" name="pwd" /><br /><br />
		<input type="button" value="로그인" onclick="checkAuth()" /><br />
		</form>
		<br />
		<br />
		<div id=message>테스트</div>
		
		<br />
		<br />
		<div onclick="checkLinkEnable()"><h1 style="color:blue">링크생성</h1>
		<p id="link">링크없음</p>
		</div>
	</body>
</html>