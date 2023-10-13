<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<!DOCTYPE html>
<html>
<style>
	@import url('https://fonts.googleapis.com/css2?family=Noto+Sans+KR:wght@100;300;400;500;700;900&display=swap');
	
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

        th {
            background-color: #007bff;
            color: #fff;
        }

        tr:nth-child(even) {
            background-color: #f2f2f2;
        }

#btn, #btn1 {
	width: 150px;
	height: 100px;
	font-size: 16px;
	border-radius: 10px;
	background-color: #cb99c5;
	color: white;
	margin: 50px;
	text-align: center;
	justify-content: center;
	padding : 10px;
}
#btn1 {
	background-color: skyblue;
}

</style>
<head>
<meta charset="UTF-8">
<title>재고 조회</title>
</head>
<body>
<h1> 재고 조회 </h1>
	<div>
		<form action = '#' method = 'get'>
			<label for = 'category'>카테고리</label>
			<select name = 'categorys' id='category'>
				<option value='select'>카테고리 선택 : </option>
				<option value='Electronic'>전자제품</option>
				<option value='sports'>스포츠</option>
				<option value='clothes'>의류</option>
			</select>
			<input type = 'submit' value='Submit' maxlength="100" placeholder="검색어 입력"/>
		</form>
			<table>
				<tr>
					<th class="text-left">재고 이름</th>
					<th class="text-left">재고 수량</th>
					<th class="text-left">재고 코드</th>
			<c:forEach var="stockInfo" items="${stockinfo}">
					<tr>
						<td class="text-left">${stockInfo.rawmaterialname}</td>
						<td class="text-left">${stockInfo.rawmaterialqty}</td>
						<td class="text-left">${stockInfo.rawmaterialcode}</td>
						<td>
							<form action='http://localhost:8090/ordersales/stockinfo4' method= 'GET' >
								<input type='submit' value='재고 채우기' >
								<input type='hidden' name='rawmaterialcode' value='${stockInfo.rawmaterialcode}'>
							</form>
						</td>
					</tr>
			</c:forEach>
			</tbody>
		</table>

		<form action = 'http://localhost:8090/ordersales/stockinfo4' method = 'GET' >
			<input type='button' value='재고 가득 채우기' id="btn" />
			<input type="hidden" value='all' name="rawmaterialcode" />
		</form>
		<form action = 'http://localhost:8090/ordersales/stockinfo4' method = 'GET' >
			<input type='button' value='재고 채우기' id="btn1" />
			<input type="hidden" value='all' name="rawmaterialcode" />
		</form>
	</div>
	<script>
        
    var btn1 = document.getElementById('btn1');
        
    btn1.addEventListener('click', () => {
            var result = prompt("채우고싶은 값 코드를 넣으세요.");
			console.log(input);
            if (result.equles(${stockInfo.rawmaterialcode}) {
                alert("재고수량을 가득 채웠습니다.");
                window.location = 'http://localhost:8090/ordersales/stockinfo2';
            }
            else(!result.equles(${stockInfo.rawmaterialcode}) || result === false) {
                alert("명령을 취소하였습니다.");
            }
           window.location = 'http://localhost:8090/ordersales/stockinfo';
        });
   <!--// let agePrompt = prompt('나이를 입력하세요.');

    let age = Number(agePrompt);

    if(age >= 20) {
      alert('통과');
    }-->
    </script>

</body>
</html>