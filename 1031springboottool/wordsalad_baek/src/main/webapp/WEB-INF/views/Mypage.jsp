<%@ page language="java" contentType="text/html; charset=UTF-8"
	isELIgnored="false" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>마이페이지</title>
</head>
<body>
잉
	<p>Id:${userinfo.id}</p>
	<p>Pw:${userinfo.pw}</p>
	<p>Tel:${userinfo.tel}</p>
	<p>NickName:${userinfo.nickname}</p>
	<p>postcount:${userinfo.postcount}</p>
	<p>commentcount:${userinfo.commentcount}</p>
	<p>State:${userinfo.state}</p>
	<p>RegistDate:${userinfo.registdate}</p>

<h1>${userinfo.nickname} 님의 My Page</h1>

<h3>아이디 : ${userinfo.id}</h3>
<h3>닉네임 : </h3>
	<table border="1">
		<tr>
			<th>아이디</th>
			<th>닉네임</th>
			<th>전화번호</th>
		</tr>
		<tr>
			<td>${userinfo.id}</td>
			<td>${userinfo.nickname}</td>
			<td>${userinfo.tel}</td>
		</tr>
	</table>
</body>
</html>
