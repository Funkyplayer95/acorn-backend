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
	
	#wrap{
		text-align: center;
	}
	
	#userMenuBar{
		width: fit-content;
	}
	
	.menu{
		display : flex;
		width: 100px;
		height: 100px;
		margin: 10px;
		background-color: #007bff;
		color: #fff;
		justify-content : 
		center;
		align-items: center;
	}	
	
	a{
		text-decoration: none;
	}
</style>
</head>
<body>
	<h1> JinDoBay </h1>
	
	<div id="wrap">
		<div id="userMenuBar">
			<div class="menu" onclick="location.href='http://localhost:8090/ordersales/productinfo?&category=electronic'">가전 제품</div>
			<div class="menu" onclick="location.href='http://localhost:8090/ordersales/productinfo?&category=fashion'">패션</div>
			<div class="menu" onclick="location.href='http://localhost:8090/ordersales/productinfo?&category=sports'">스포츠</div>
		</div>
	</div>
	
</body>
</html>