<%@ page language="java" contentType="text/html; charset=UTF-8"
	isELIgnored="false" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>마이페이지</title>
</head>
<style>
body {
	text-align: center;
}

#bigdiv {
	margin: 0 auto;
	width: 600px;
	/* height: 600px; */
	border: 2px solid black;
	padding: 0;
	border-radius: 5%;
	
}

#updiv {
	justify-content: center;
	width: 500px;
	height: 300px;
	margin: 0 auto;
	text-align: left;
	font-size : 16px;
}

#underdiv {
	justify-content: center;
	display: flex;
	height: 200px;
	margin: 0 auto;
}

#underdiv>div {
	width: 50%;
	height: 100%;
}

#underdiv>div>a {
	font-size: 70px;
	color: #D94925;
	text-decoration-line: none;
}
#underdiv>div>a> a:hover {
	color: #80CBC4;
	cursor: pointer;
}

#div1 {
	border-right : solid black 2px;
}
#div2 {
	border-left : solid black 2px;
}

hr {
	border: 10px;
	margin: 0;
}
h4 {
	margin: 5px;
}
</style>
<body>
<br><br><br>
	<div id="bigdiv">
		<h1>&#60; ${userinfo.nickname} &#62; 님의 My Page</h1>
		<div id="updiv">
			<h3>아이디 : ${userinfo.id}</h3>
			<br>
				<form action="/Mypage/changenickname" method="post">
				<h3>
					닉네임 : ${userinfo.nickname}   &nbsp;
    						<input type="hidden" name="id" value="${userinfo.id}">
    						<input type="submit" value="닉네임 변경">
				</h3>
			</form>
			<br>
			<form action="/Mypage/changepw" method="post">
				<h3>
					비밀번호 변경 : 
    						<input type="hidden" name="id" value="${userinfo.id}">
    						<input type="submit" value="비밀번호 변경">
				</h3>
			</form>
			<br>
			<form action="/Mypage/changetel" method="post">
				<h3>
					핸드폰 번호 : ${userinfo.tel} 
    						<input type="hidden" name="id" value="${userinfo.id}">
    						<input type="submit" value="전화번호 변경">			
				</h3>
			</form>
			<br>
		</div>
		<hr size=10 color=#D94925>
		<div id="underdiv">
			<div id="div1">
				<h4>&#60; 내가 쓴 게시글 &#62;</h4> <br> <a href=#> ${userinfo.postcount} </a>
			</div>
			<div id="div2">
				<h4>&#60; 내가 쓴 댓글 &#62;</h4> <br> <a href=#> ${userinfo.commentcount} </a>
			</div>
		</div>

	</div>
<br><br>
</body>
</html>
