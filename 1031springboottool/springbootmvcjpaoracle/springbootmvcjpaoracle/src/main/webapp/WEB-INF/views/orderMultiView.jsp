<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"  %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>JSP JSPList</title>
	</head>
	<body>
		<h3>${msg}</h3>
		<table border="1">
			<tr>
				<th>주문번호</th>
				<th>주문상태</th>
				<th>회원아이디</th>
			</tr>
			<tr>
				<td>${orders.order_id}</td>
				<td>${orders.order_status}</td>
				<td>${orders.member_id}
			</tr>
		</table>
		
		<br>
		
		<table border="1">
			<tr>
				<th>회원번호</th>
				<th>회원주소</th>
				<th>이메일</th>
				<th>회원이름</th>
				<th>회원암호</th>
				<th>회원역할</th>
			</tr>
			<tr>
				<td>${member.id}</td>
				<td>${member.address}</td>
				<td>${member.email}</td>
				<td>${member.name}</td>
				<td>${member.password}</td>
				<td>${member.role}</td>
			</tr>
		</table>
		
		<br>
		
		<table border="1">
			<tr>
				<th>인덱스</th>
				<th>주문상품번호</th>
				<th>주문상품갯수</th>
				<th>주문상품가격</th>
				<th>상품아이디</th>
				<th>주문아이디</th>
			</tr>
					
			<c:forEach var="orderitem" items="${orderitemlist}" varStatus="idx">
			<tr>
				<td>${idx.index + 1}</td>
				<td>${orderitem.order_item_id}</td>
				<td>${orderitem.count}</td>
				<td>${orderitem.order_price}</td>
				<td>${orderitem.item_id}</td>
				<td>${orderitem.order_id}</td>
			</tr>
			</c:forEach>
		</table>
	
	</body>
	
</html>