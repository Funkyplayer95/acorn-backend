<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<!DOCTYPE html>
<html>
<style>
@import
	url(https://fonts.googleapis.com/css?family=Roboto:400,500,700,300,100)
	;

body {
	background-color: lightgray;
	font-family: "Roboto", helvetica, arial, sans-serif;
	font-size: 16px;
	font-weight: 300px;
	text-rendering: optimizeLegibility;
	margin: 0 auto;
}

/*** Table Styles **/
.table-fill {
	background: white;
	border-radius:``````````````````` 3px;
	border-collapse: collapse;
	height: 300px;
	margin: auto;
	max-width: 800px;
	padding: 5px;
	width: 100%;
	box-shadow: 0 5px 1px rgba(0, 0, 0, 0.1);
	animation: float 5s infinite;
}

div {
	justify-content: center;
	text-align: center;
	padding: 10px;
}

th {
	color: #D5DDE5;;
	background: #1b1e24;
	border-bottom: 4px solid #9ea7af;
	border-right: 1px solid #343a45;
	font-size: 20px;
	font-weight: 100;
	padding: 25px;
	text-align: left;
	text-shadow: 0 1px 1px rgba(0, 0, 0, 0.1);
	vertical-align: middle;
}

th:first-child {
	border-top-left-radius: 5px;
}

th:last-child {
	border-top-right-radius: 5px;
	border-right: none;
}

tr {
	border-top: 1px solid #C1C3D1;
	border-bottom-: 1px solid #C1C3D1;
	color: #666B85;
	font-size: 13px;
	font-weight: normal;
	text-shadow: 0 1px 1px rgba(256, 256, 256, 0.1);
}

tr:hover td {
	background: #2e2649;
	color: #FFFFFF;
	border-top: 1px solid #22262e;
}

tr:first-child {
	border-top: none;
}

tr:last-child {
	border-bottom: none;
}

tr:nth-child(odd) td {
	background: #EBEBEB;
}

tr:nth-child(odd):hover td {
	background: #4E5066;
}

tr:last-child td:first-child {
	border-bottom-left-radius: 5px;
}

tr:last-child td:last-child {
	border-bottom-right-radius: 5px;
}

td {
	background: #FFFFFF;
	padding: 20px;
	text-align: left;
	vertical-align: middle;
	font-weight: 300;
	font-size: 18px;
	text-shadow: -1px -1px 1px rgba(0, 0, 0, 0.1);
	border-right: 1px solid #C1C3D1;
	padding: 15px;
}

td:last-child {
	border-right: 0px;
}

th.text-left {
	text-align: left;
}

td.text-left {
	text-align: left;
}

#btn {
	width: 150px;
	height: 100px;
	font-size: 16px;
	border-radius: 10px;
	background-color: #cb99c5;
	color: white;
	margin: 50px;
	text-align: center;
	justify-content: center;
}
</style>
<head>
<meta charset="UTF-8">
<title>재고 조회</title>
</head>
<body>
	<div>
		<table class="table-fill">
			<thead>
				<tr>
					<th class="text-left">재고 이름</th>
					<th class="text-left">재고 수량</th>
					<th class="text-left">재고 코드</th>
				</tr>
			</thead>
			<c:forEach var="stockInfo" items="${stockinfo}">
				<tbody class="table-hover">
					<tr>
						<td class="text-left">${stockInfo.rawmaterialname}</td>
						<td class="text-left">${stockInfo.rawmaterialqty}</td>
						<td class="text-left">${stockInfo.rawmaterialcode}</td>
					</tr>
			</c:forEach>
			</tbody>
		</table>
<%// 하나만 50으로 재고변동 할 수 있는 버튼을 만들어야한다. 각 셀마다 넣어주던가, 버튼에서 코드를 입력받아 진행하던가. %>
		<input type='button' value='재고 가득 채우기' id="btn" />
	</div>
	<script>
        
    var btn = document.getElementById('btn');
        
    btn.addEventListener('click', () => {
            var result = confirm("재고수량을 가득 채우시겠습니까?");

            if (result === true) {
                alert("재고수량을 가득 채웠습니다.");
                window.location = 'http://localhost:8090/ordersales/stockinfo2';
            }
            else if (result === false) {
                alert("명령을 취소하였습니다.");
            }
           window.location = 'http://localhost:8090/ordersales/stockinfo';
        });
    </script>

</body>
</html>