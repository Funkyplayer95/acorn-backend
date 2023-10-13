<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="java.util.Date"%>
<%@page import="java.time.format.DateTimeFormatter"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>판매내역</title>
<style>
@import url('https://fonts.googleapis.com/css2?family=Noto+Sans+KR:wght@100;300;400;500;700;900&display=swap');

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
	<div>
	<h1>판매내역</h1>
		<br>
		<form action="/ordersales/salesinfo">
			<label for="start_date">시작 날짜:</label>
			<input type="date"id="start_date" name="start_date" value="${vstartdate}">
			&nbsp;&nbsp;&nbsp;&nbsp;
			<label for="end_date">종료날짜:</label>
			<input type="date" id="end_date" name="end_date" value="${venddate}">
			<input	type="submit" value="적용">
			<input type="reset" value="돌아가기">
		</form>
		<br>
		
		<table class="tableTitle" border="1" width="100%">
			<tr>
				<th>상품 이름</th>
				<th>수량</th>
				<th>날짜</th>
			</tr>
			
			<c:forEach var="salesinfo" items="${salesinfolist}">
				<tr>
					<td>${salesinfo.goodsname}</td>
					<td>${salesinfo.orderquantity}</td>
					<td>${salesinfo.salesdate}</td>
				</tr>
			</c:forEach>
			
		</table>
	</div>
</body>
</html>