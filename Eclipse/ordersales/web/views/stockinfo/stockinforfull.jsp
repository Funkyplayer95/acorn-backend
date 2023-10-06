<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>  
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>재고 변동 사항</title>
    <style>
        input {
            width: 100px;
            height: 30px;
            font-size: 9px;
        }
    </style>
</head>

<body>
    <input type='button' value='재고 가득 채우기' id="btn" />
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
            window.location = 'http://localhost:8090/ordersales/login/login.jsp';
        });
    </script>
</body>

</html>