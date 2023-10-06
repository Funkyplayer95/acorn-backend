<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>  
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>회원가입</title>
    <style>
	    form {
	      width: 600px;
	      margin: auto;
	    }
	    form legend {
	      font-size: 20px;
	      text-align: center;
	    }
	    form p span {
	      font-size: 13px;
	      color: rgb(0, 60, 255);
	      font-style: italic;
	    }
	</style>
	</head>

	<body>
	  <form action="http://localhost:8090/ordersales/regimem" method="GET">
	    <fieldset>
	      <legend>회원가입</legend>
	      <p>
	        <label>아이디</label>
	        ${id}
	        <input type="hidden" name="id" value="${id}">
	        <br>
	      </p>
	      <p>
	        <label>비밀번호</label>
			${passwd}
			<input type="hidden" name="passwd" value="${passwd}">
	        <br>
	      </p>
	      <p>
	        <label>연락처</label>
			<input type="hidden" name="tel">
	        <br>
	      </p>
	      <p>
	        <label>역할</label>
	        <input type="text" name="role">
	        <br>
	      </p>
	      <p>
	        <label>주소</label>
	        <input type="text" name="addr">
	        <br>
	      </p>
	    </fieldset>
	    <input type="submit" value="회원가입">
	  </form>
</body>

</html>