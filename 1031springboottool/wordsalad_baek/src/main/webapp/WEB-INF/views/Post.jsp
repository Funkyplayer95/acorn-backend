<%@ page language="java" contentType="text/html; charset=UTF-8"
	isELIgnored="false" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>마이페이지</title>
</head>
<body>
	<p>POSTNUMBER:${postinfo.POSTNUMBER}</p>
	<%-- <p>POSTTITLE:${postinfo.POSTTITLE}</p> --%>
	<p>POSTCONTENTS:${postinfo.POSTCONTENTS}</p>
	<p>POSTWRITER:${postinfo.POSTWRITER}</p>
	<p>POSTDATE:${postinfo.POSTDATE}</p>
	<p>POSTLIKE:${postinfo.POSTLIKE}</p>
	<p>POSTHATE:${postinfo.POSTHATE}</p>
	<p>zlfzlfzlf</p>
	<table border="1">
		<tr>
			<th>게시글번호</th>
			<th>댓글내용</th>
			<th>댓글작성자</th>
			<th>작성일자</th>
			<th>좋아요수</th>
			<th>싫어요수</th>
		</tr>
		<c:forEach var="cmtlist" items="${cmtinfo}">
			<c:if test="${cmtlist.postinfo == postinfo.POSTNUMBER}">
				<p>Debug - cmtlist.POSTNUMBER: ${cmtlist.POSTNUMBER}</p>
				<c:out value="${cmtlist.POSTNUMBER == postinfo.POSTNUMBER}" />
				<tr>

					<td>${cmtlist.postinfo}</td>
					<td>${cmtlist.COMMENTCONTENTS}</td>
					<td>${cmtlist.COMMENTWRITER}</td>
					<td>${cmtlist.COMMENTDATE}</td>
					<td>${cmtlist.COMMENTLIKE}</td>
					<td>${cmtlist.COMMENTHATE}</td>
				</tr>
			</c:if>
		</c:forEach>
	</table>
	<p>Debug - cmtlist.POSTNUMBER: ${cmtlist.POSTNUMBER}</p>
	<c:forEach var="cmtlist" items="${cmtinfo}">
		<c:if test="${cmtlist.postinfo == postinfo.POSTNUMBER}">
			
			<c:out value="${cmtlist.POSTNUMBER == postinfo.POSTNUMBER}" />
		</c:if>
	</c:forEach>
</body>
</html>
