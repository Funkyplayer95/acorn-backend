<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.SQLException"%>
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
		Add new persons : <input type="text" name="user" />
		<input type="submit" value="전송">
	</form>
	<% 
		List<String> persons = (ArrayList<String>)((session.getAttribute("userlist")));
		if(persons == null) {
			persons = new ArrayList<String>();
			session.setAttribute("userlist", persons);
		}
		
		String user = request.getParameter("user");
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		Class.forName("oracle.jdbc.OracleDriver");
		conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "black", "black");
		String sql = "SELECT userid, userpassword FROM userinfo WHERE userid = '" + user + "'";
		stmt = conn.createStatement();
		rs = stmt.executeQuery(sql);
		
		if( !(user==null) && !(user.equals(""))) {
			persons.add(user);
		}
			
		for(String loginUser :  persons) {
			out.println("<li>" + loginUser + "</li>");
		}
		
		while(rs.next()) {
			out.println(rs.getString(1) + "" + ":" + rs.getString(1));
		}
		
	%>
</body>
</html>