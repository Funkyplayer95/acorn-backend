<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<!DOCTYPE html>
<html>
<style>
@import
	url('https://fonts.googleapis.com/css2?family=Noto+Sans+KR:wght@100;300;400;500;700;900&display=swap')
	;

h1 {
	text-align: center;
	text-decoration: underline;
}

body {
	background-color: #f0f0f0;
	font-family: Arial, sans-serif;
	font-size: 16px;
	font-weight: 300px;
	text-rendering: optimizeLegibility;
	margin: 0;
	padding: 0;
}

table {
	width: 80%;
	margin: 10px auto;
	border-collapse: collapse;
	background-color: #fff;
}

th, td {
	padding: 10px;
	text-align: center;
	border: 1px solid #ddd;
}

a {
	color: black;
}

th {
	background-color: #007bff;
	color: #fff;
}

tr:nth-child(even) {
	background-color: #f2f2f2;
}

#search-box {
	display: flex;
	align-items: center;
	height: 50px;
	margin: 5px; /* 전체적인 부피 줄임 */
	margin-left: 150px;
	width: 400px;
}

#search-box select, #search-box input[type="text"] {
	padding: 6px; /* 작은 패딩 적용 */
	border: none;
	border-radius: 5px;
	margin-right: 10px;
	font-size: 14px;
	flex-grow: 1;
	background-color: white; /* 배경색 없앰 */
}

#search-box button {
	padding: 6px 16px; /* 작은 패딩 적용 */
	height: 30px;
	width: 200px; /* 가로 너비를 늘림 */
	background-color: #007bff;
	color: #fff;
	border: none;
	border-radius: 5px;
	cursor: pointer;
	transition: background-color 0.3s;
	box-shadow: 0px 4px 0 rgb(0, 0, 0, 0.5);
}

#search-box button:hover {
	background-color: #014894; /* 호버 시 배경색 변경 */
}

#search-box button:active {
	box-shadow: 0px 1px 0 rgb(0, 0, 0, 0);
	position: relative;
	top: 3px;
}

#btn {
	width: 150px;
	height: 100px;
	font-size: 18px;
	font-weight: bold;
	border-radius: 10px;
	background-color: #a905f0;
	color: white;
	margin: auto;
	border: none;
	cursor: pointer;
	transition: background-color 0.3s;
	box-shadow: 0px 4px 0 rgb(0, 0, 0, 0.5);
}

#btn:hover {
	background-color: #4e1c63;
}

#btn:active {
	box-shadow: 0px 1px 0 rgb(0, 0, 0, 0);
	position: relative;
	top: 3px;
}

#full-btn {
	color: white;
	font-size: 15px;
	background-color: #191970;
	border: none;
	border-radius: 3px;
	cursor: pointer;
	width: 70px;
	height: 30px;
}

#btn-form {
	display: flex;
	justify-content: center;
	align-content: center;
	margin-top: 50px;
}

#headerWrap {
	display: flex;
	justify-content: space-between;
}

#header1, #header2 {
	width: 200px;
	margin: 10px;
}
</style>
<head>
<meta charset="UTF-8">
<title>재고 조회</title>
</head>
<body>

	<%
		String id = (String)session.getAttribute("id");
	%>

	<div id=headerWrap>
		<div id="header1"></div>
		<div>
			<a href="/ordersales/views/Admin/adminmenu.jsp"><h1>관리자 메뉴 -
					재고 조회</h1></a>
		</div>
		<div id=header2>
			<span><strong><%= id %> | </strong></span> <span id="logout"
				onclick="location.href='/ordersales/views/login/logout.jsp'">
				로그아웃</span>
		</div>
	</div>
	<div>
		<form action='/ordersales/stockinfosearch' method='get'
			id='search-box'>
			<label for='category'></label> <select name='searchplace'
				id='category'>
				<option value=''>카테고리 선택</option>
				<option value='electronic'>전자제품</option>
				<option value='sports'>스포츠</option>
				<option value='fashion'>의류</option>
				<option value='toy'>장난감</option>
			</select> <input type='text' maxlength="100" placeholder="검색어 입력"
				name='searchtext' />
			<button type='submit'>검색</button>
		</form>

		<table>
			<tr>
				<th class="text-left">재고 이름</th>
				<th class="text-left">재고 수량</th>
				<th class="text-left">재고 코드</th>
				<th class="text-left">채우기</th>
			</tr>
			<c:forEach var="stockInfo" items="${stockinfo}">
				<tr>
					<td class="text-left">${stockInfo.rawmaterialname}</td>
					<td class="text-left">${stockInfo.rawmaterialqty}</td>
					<td class="text-left">${stockInfo.rawmaterialcode}</td>
					<td>
						<form action="/ordersales/stockinfo4" method="get"
							onsubmit="return is_fill();">
							<input type='number' min='1' value='0' id='full-btn' name='little_full' />
							<input type='submit' value='채우기' id='full-btn' />
							<input type='hidden' value="${stockInfo.rawmaterialcode}" name="rawmaterialcode" />
						</form>
					</td>
				</tr>
			</c:forEach>
		</table>

		<form action="/ordersales/stockinfo4" method="get"
			onsubmit="return full_fill()" id='btn-form'>
			<input type='submit' value='전체 채우기' id="btn" /> <input type='hidden'
				value="all" name="rawmaterialcode" />
		</form>

	</div>
</body>
<script>
function is_fill() {
	var i = document.getElementById('full-btn').value;
	if (confirm("수량 " + i + "개 만큼 채우시겠습니까?")) {
		alert("재고 수량을 채웠습니다");
		return true;
	} else {
		alert("명령을 취소했습니다.");
		return false;
	}
}
function full_fill() {
	if (confirm("재고 수량을 채우시겠습니까?")) {
		alert("재고 수량을 채웠습니다");
		return true;
	} else {
		alert("명령을 취소했습니다.");
		return false;
	}
}
</script>
</html>