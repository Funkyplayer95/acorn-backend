<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>할일</title>
</head>
<body>
	<form action="sessionTest.jsp">
		Add new item: <input type="text" name="theItem" />
		<input type="submit" value="전송">
	</form>
	<% 
	List<String> items = (ArrayList<String>)(session.getAttribute("todoList"));
	if(items == null) {
		items = new ArrayList<String>();
		session.setAttribute("todoList", items);
	}
	
	String theItem = request.getParameter("theItem");
	
	if( !(theItem==null) ) {
		items.add(theItem);
	}

	for(String item :  items) {
		out.println("<li>" + item + "</li>");
	}
	
	%>
</body>
</html>