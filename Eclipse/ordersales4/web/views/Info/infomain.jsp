<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 정보</title>
</head>
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
	
	#headerWrap{
    	display: flex;
    	justify-content: space-between;
    }
    #header1, #header2{
    	width: 200px;
    	margin: 10px;
    }
</style>
<body>

	<%
		String id = (String)session.getAttribute("id");
	%>
	
	<div id=headerWrap>
		<div id="header1"></div>
		<div>
			<h1> 회원 정보 </h1>
		</div>
		<div id=header2>
			<span><strong><%= id %> | </strong></span>
			<span id="logout" onclick="location.href='/ordersales/views/login/logout.jsp'" >  로그아웃</span>
		</div>
	</div> 
	
	<h3>이름</h3>
	<h3>ID: <%=id %></h3>
	<h3>핸드폰 번호</h3>
	<h3>주소</h3>

</body>
</html>