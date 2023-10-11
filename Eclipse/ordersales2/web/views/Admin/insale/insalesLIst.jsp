<%@page import="com.team.ordersales.order.dto.IdentifyInsalesDto"%>
<%@page import="com.team.ordersales.sales.dao.InsalesDao"%>
<%@ page import="java.util.ArrayList" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>  
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>판매중 상품 보기</title>
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
	
        /* 토글 스위치 스타일 */
	    .toggleSwitch {
	        width: 2rem;
	        height: 1rem;
	        position: relative;
	        background-color: #fff;
	        box-shadow: 0 0 1rem 3px rgba(0, 0, 0, 0.15);
	        cursor: pointer;
	        border-radius: 2rem;
	        margin: auto; /* 가운데 정렬 */
	    }
	
	    .toggleSwitch .toggleButton {
	        width: 1rem;
	        height: 1rem;
	        position: absolute;
	        top: 50%;
	        left: 0.2em;
	        transform: translateY(-50%);
	        border-radius: 50%;
	        background: #EFFBFB; /* "off" 상태의 색상: 빨간색 */
	        transition: left 0.2s ease-in-out, background-color 0.2s ease-in-out;
	    }
	
	    /* 체크박스가 체크되면 변경 이벤트 */
	    .toggleSwitch input:checked ~ .toggleButton {
	        left: calc(100% - 1.2rem);
	        background: #4CAF50; /* "on" 상태의 색상: 초록색 */
	    }
    </style>
</head>
<body>
    <div>
        <h1>판매중 상품목록</h1>
    </div>
        
    <div id="search-box">        
		<form method="post" name="search" action="searchInsales.jsp">
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
    	<form action="###" method="post">	
        <table border="1">
            <tr>
                <th>상품코드</th>
                <th>상품이름</th>
                <th>원자재 코드</th>
                <th>원자재 수량</th>
                <th>판매여부</th>
            </tr>
                <%
                	//게시글을 담을 인스턴스
                   	InsalesDao insalesDao = new InsalesDao();
                	//list 생성 그 값은 현재의 페이지에서 가져온 리스트 게시글목록
                    ArrayList<IdentifyInsalesDto> list = InsalesDao.getsaleList();
                	  //가져온 목록을 하나씩 출력하도록 선언한다..
                	for(int i = 0; i < list.size(); i++)
                		
                	{
                %>
                
                <tr>
                    <td><%=list.get(i).getGOODSCODE() %></td>
                    <td><%=list.get(i).getGOODSNAME() %></td>
                    <td><%=list.get(i).getRAWMATERIALCODE() %></td>
                    <td><%=list.get(i).getRAWMATERIALQTY() %></td>
		      	 	<td><%=list.get(i).getINSALES() %> <input type="button" value="수정"></td>				
		      	</tr>
                
                <%
                    }
                %>
        </table>
        </form>
    </div>
</body>
</html>
