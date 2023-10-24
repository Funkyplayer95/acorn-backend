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
	
	header{
        background-color: white;
        text-align: center;
        height: fit-content;
    }
    
	a{
		text-decoration: none;
		color: black;
	}
	
	li{
        list-style: none;
        line-height: 30px;
    }
    
    /* 헤더부분 전체 */
	.headerContainer{
	    margin: 0;
	    padding: 0;
	    border: 0;
	    font-size: 100%;
	    vertical-align: baseline;
	}
	/* 헤더부분 배경 */
	.headerWrap{
	    background-color: white;
	    border-top: 1px solid rgb(232, 216, 197);
	    border-bottom: 2px solid #bbb;
	    left: 0;
	    position: fixed;
	    top: 0;
	    width: 100%;
	}
    /* 로고, 이름을 감싸는 div */
    .headerSubWrap1{
        height: 120px;
        width: 1100px;
        margin: 0 auto;
        position: relative;
    }
    /* 로고 & 타이틀 */
    /* 로고 */
    .logo{
        position: absolute;
        top: 19px;
        left: 0;
    }
    /* 타이틀 */
    .title{
        font-family: 'Jeju Hallasan', cursive;
        font-size: 50px;
        color: #007bff;
    }
    .info{
    	width: 200px;
    	margin: 10px;
    }
    
    /* 네브바 */
    /* 메뉴 네브바 전체 감싸는 div */
    .headerSubWrap2{
    	position: absolute;
        display: flex;
        align-items: flex-start;

        margin: 0;
        padding: 0;
        border: 0;
        left: 0;
        font-size: 100%;

        width: 100%;
        height: 130px;
        color: rgb(141, 137, 137);
    }
    /* 메뉴 네브바 위치 조정 */
    .subNavWrap{
    	position: absolute;
        margin: 0;
        padding: 0;
        border: 0;
        font-size: 100%;
        left: 0;
        width: 100%;
    }
    /* 카테고리 메뉴 */
    .navBar{
    	display: flex;
        justify-content: center;
        font-size: 20px;
        margin-top: 10px;
    }
    
   .menu{
    	display: flex;
        flex-direction: column;
        height: 50px;
	}
	.menu li{
		line-height: 30px;
	}
	.menu li .menu{
		display:flex;
	}
	.menu a:hover{
		text-decoration: underline;
	}	
	.subMenu{
		display:none;
	}
	
	</style>
</head>
<body>
	<%
		String id = (String)session.getAttribute("id");
	%>
	
	<div>
		<header>
			<div class="headerContainer">
				<div class="headerWrap">
					<div class="headerSubWrap1">
						<a href="./main.jsp">
							<div class="logo">
								<img src="#" alt="JinDoBay">
							</div>
						</a>
						
						<div>
							<label for="title" class="title">JinDoBay</label>
						</div>
						
						<%
							if(id==null){%>
								<div class="info">
								<span><strong><%= id %> | </strong></span>
								<span id="logout" onclick="location.href='/ordersales/views/login/logout.jsp'" >  로그아웃</span>
							</div>
							<%}%>
						
					</div>
					
					<div class="headerSubWrap2">
						<div class="subNavWrap">
							<nav class="navBar">
								<ul id="electronic" class="menu">
									<li><a href="/ordersales/productinfo?&category=electronic">전자제품</a></li>
									<div class="subMenu">
										<ul>
											<li class="samsung">
												<a href="#">삼성</a>
											</li>
											<li class="apple">
												<a href="#">애플</a>
											</li>
											<li class="lg">
												<a href="#">엘지</a>
											</li>
											<li class="dyson">
												<a href="#">다이슨</a>
											</li>
										</ul>
									</div>
								</ul>
								<ul id="fashion" class="menu">
									<li><a href="#">패션</a></li>
									<div class="subMenu">
										<ul>
											<li class="top">
												<a href="#">상의</a>
											</li>
											<li class="pants">
												<a href="#">하의</a>
											</li>
											<li class="outer">
												<a href="#">아우터</a>
											</li>
											<li class="shoes">
												<a href="#">신발</a>
											</li>
										</ul>
									</div>
								</ul>
								<ul id="sports" class="menu">
									<li><a href="#">스포츠</a></li>
									<div class="subMenu">
										<ul>
											<li class="football">
												<a href="#">축구</a>
											</li>
											<li class="baseball">
												<a href="#">야구</a>
											</li>
											<li class="basketball">
												<a href="#">농구</a>
											</li>
											<li class="tennis">
												<a href="#">테니스</a>
											</li>
										</ul>
									</div>
								</ul>
								<ul id="toy" class="menu">
									<li><a href="#">완구</a></li>
									<div id="subToy" class="subMenu">
										<ul>
											<li class="character">
												<a href="#">캐릭터</a>
											</li>
											<li class="robot">
												<a href="#">로봇</a>
											</li>
											<li class="doll">
												<a href="#">인형</a>
											</li>
											<li class="boardgame">
												<a href="#">보드게임</a>
											</li>
										</ul>
									</div>
								</ul>
							</nav>
						</div>
					</div>
				</div>
			</div>
		</header>
	</div>
</body>
</html>