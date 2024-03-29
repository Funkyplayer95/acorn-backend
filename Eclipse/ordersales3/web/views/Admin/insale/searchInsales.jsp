<%@page import="com.team.ordersales.order.dto.IdentifyInsalesDto"%>
<%@page import="com.team.ordersales.sales.dao.InsalesDao"%>
<%@ page import="java.util.List" %>
<%@page import="java.io.PrintWriter"%>
<%@page import="javax.servlet.http.HttpServletResponse"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>  
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>판매중 상품 보기</title>
    <style>
    	a{
    		color: black;
    	}
    
        body {
            font-family: Arial, sans-serif;
            background-color: #f0f0f0;
            margin: 0;
            padding: 0;
        }

        h1 {
            text-align: center;
            color: black;
        }
        
        a {
	        text-decoration: none;
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
        
	    .jd-td {
	        border-right: none;
	        margin-left:35px;
	        width:40px;
	    }
	
	    .rd-td {
	        border-left: none;
	        text-align: center;
	        vertical-align: middle;
	        width:20px;
	    }
	    
	    .fd-td{
	    	width:120px;
	    }
	
	    #edit-btn {
	        color: white;
	        font-size: 15px;
	        background-color: #191970;
	        border: none;
	        border-radius: 3px;
	        cursor: pointer;
	    }
    
        th {
            background-color: #007bff;
            color: #fff;
        }

        tr:nth-child(even) {
            background-color: #f2f2f2;
        }
        
		/* 검색스타일 */
		#search-box {
		    display: flex;
		    align-items: center;
		    height: 50px;
		    margin: 5px; /* 전체적인 부피 줄임 */
		    margin-left: 150px;
		}
		
		#search-box select,
		#search-box input[type="text"] {
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
		    width: 60px; /* 가로 너비를 늘림 */
		    background-color: #4CAF50; /* 초록색 배경색 적용 */
		    color: #fff;
		    border: none;
		    border-radius: 5px;
		    cursor: pointer;
		    transition: background-color 0.3s;
		}
		
		#search-box button:hover {
		    background-color: #45a049; /* 호버 시 배경색 변경 */
		}
		
		#search-box table {
		    text-align: right;
		    background-color: transparent;
		    border-collapse: collapse;
		}
		
		#search-box table tr td {
		    padding: 5px;
		    border: none;
		}
		
    </style>
    
</head>
<body>
    <div>
        <h1><a href="http://localhost:8090/ordersales/insaleList">판매중 상품목록</a></h1>
    </div>
        
    <div id="search-box">        
		<form method="GET" name="search" action="http://localhost:8090/ordersales/search">
			<table class="pull-right">
				<tr>
					<td><select class="form-control" name="searchField">
							<option value="0">선택</option>
							<option value="GOODSNAME">상품이름</option>
							<option value="GOODSCODE">상품코드</option>
					</select></td>
					<td><input type="text" class="form-control"
						placeholder="검색어 입력" name="searchText" maxlength="100"></td>
					<td><button type="submit" class="btn btn-success">검색</button></td>
				</tr>
			</table>
		</form>    
	</div>
    
    <div>
    	<table border="1">
            <tr>
                <th>상품코드</th>
                <th>상품이름</th>
                <th>원자재 코드</th>
                <th>원자재 수량</th>
                <th class="ib-th-5" colspan="2">판매여부</th>
            </tr>
            
        <c:if test="${empty searchInsalelist}">		
		    <script>
		        alert('검색결과가 없습니다.');
		        history.go(-1);
    		</script>
        </c:if>
        
		<c:forEach var="searchInsalelist" items="${searchInsalelist}">
			<tr>
				<td class="fd-td">${searchInsalelist.GOODSCODE}</td>
				<td>${searchInsalelist.GOODSNAME}</td>
				<td>${searchInsalelist.RAWMATERIALCODE}</td>
				<td>${searchInsalelist.RAWMATERIALQTY}</td>
				<td class="jd-td">${searchInsalelist.INSALES}</td>
				<td class="rd-td">
					<form action="http://localhost:8090/ordersales/alertInsale" method="GET" onsubmit="return call_confirm()">
						<input type="submit" id="edit-btn" name="alertInsales" value="변경">
						<input type="hidden" name="goodsCode" value="${searchInsalelist.GOODSCODE}">
						<input type="hidden" name="insales" value="${searchInsalelist.INSALES}">
					</form>
					<!-- <a href="http://localhost:8090/ordersales/alertInsale?goodsCode="${insalelist.GOODSCODE}"&insales="${insalelist.INSALES}"></a>
						이 방법으로도 가능. -->
				</td>
			</tr>
		</c:forEach>
       </table>
    </div>    
</body>
<script>
	function call_confirm(){
		if(confirm("판매여부 바꾸시겠습니?")){
			alert("변경완료");
			return true;
		}else{
			alert("취소되었습니다");
			return false;
		}
	}
</script>
</html>
