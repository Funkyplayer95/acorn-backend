<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
	body {
            font-family: Arial, sans-serif;
            background-color: #f0f0f0;
            margin: 0;
            padding: 0;
	}
	
	h1 {
	    text-align: center;
	    text-decoration: underline;
	    
	}
	
	.menu{
		display : flex;
		width: 100px;
		height: 100px;
		margin: 10px;
		background-color: #007bff;
		color: #fff;
		justify-content : center;
		align-items: center;
	}	

</style>
</head>
<body>
	<h1> JinDoBay</h1>
	
	<div id="userMenuBar">
		<div class="menu" onclick="location.href='http://localhost:8090/ordersales/views/User/electronic/electronic.jsp'">가전 제품</div>
		<div class="menu" onclick="location.href='http://localhost:8090/ordersales/views/User/fashion/fashion.jsp'">패션</div>
		<div class="menu" onclick="location.href='http://localhost:8090/ordersales/views/User/sports/sports.jsp'">스포츠</div>
	</div>
</body>
</html>