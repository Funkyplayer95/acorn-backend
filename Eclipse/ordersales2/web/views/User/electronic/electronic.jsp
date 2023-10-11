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
	table {
        width: 80%;
        margin: 20px auto;
        border-collapse: collapse;
        background-color: #fff;
    }

    th, td {
        padding: 10px;
        text-align: center;
        border: 1px solid #ddd;
    }

    th {
        background-color: #007bff;
        color: #fff;
    }

    tr:nth-child(even) {
        background-color: #f2f2f2;
    }

</style>
</head>
<body>
	<h1> JinDoBay - 전자 제품 </h1>
	
	<div>
		<table border="1">
			<tr>
             	<th class="checkbox-cell"></th>
             	<!-- <th><input type="checkbox" name="selectProd"></th> -->
                <th>상품 사진</th>
                <th>상품 이름</th>
                <th>가격</th>
                <th>수량</th>
            </tr>
		</table>
	</div>
</body>
</html>