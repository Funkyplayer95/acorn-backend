<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>  
<!DOCTYPE html>
<html>

<head>
    <meta charset="UTF-8">
    
    <style>
	div {
           margin: auto;
           margin-top : 70px;
           
           width: 1200px;
           height : 150px;
           border-radius: 5px;
           text-align: center;
           padding: 20px;
       	}
    .btn {
    	margin-right: 20px;
    	text-align : center;
    	justify-content: center;
    	font-size : 20ox;
    	color: white;
    
    }

    input {
           width: 200px;
           height : 90px;
           padding: 10px;
           box-sizing: border-box;
           border-radius: 5px;
           border: none;
          }
	#btn1,#btn2,#btn3,#bnt4 {
	margin-bottom : 10px;
	}
	#btn1 {
		background-color: orange;
	}
	#btn2 {
		background-color: pink;
	}
	#btn3 {
		background-color: skyblue;
	}
	#btn4 {
		background-color: purple;
	}
</style>
    <title>관리자 메뉴창</title>
</head>

<body>
<h1 style = "text-align: center">반갑습니다 <br><br>관리자 메뉴를 선택해주세요</h1>
<div>
	<input type='button' value='주문 가능 상품 조회' id="btn1" class="btn" />
	<input type='button' value='새로운 상품 추가' id="btn2" class="btn" />
	<input type='button' value='현 재고 정보' id="btn3" class="btn" />
	<input type='button' value='현 판매 정보' id="btn4" class="btn" />
</div>
</body>

</html>