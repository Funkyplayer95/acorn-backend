<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>관리자 메뉴</title>

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
	<div>
		<h1> 관리자 메뉴 </h1>
	</div>
	
	<div id="adminMenuBar">
		<div class="menu" onclick="location.href='http://localhost:8090/ordersales/views/Admin/stock/stockinfolookup.jsp">재고 관리</div>
		<div class="menu" onclick="location.href='http://localhost:8090/ordersales/views/Admin/insale/insalesLIst.jsp'">상품 관리</div>
		<div class="menu" onclick="location.href='http://localhost:8090/ordersales/views/Admin/sales/salesinfo.jsp'">매출 관리</div>
	</div>
</body>
</html>