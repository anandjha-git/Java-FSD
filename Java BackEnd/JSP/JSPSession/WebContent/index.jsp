<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import = "java.io.*,java.util.*, javax.servlet.*" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form method="get" action="index.jsp">
		Enter Uname:<input type="text" name="user" required><br />
		
		<input type="submit" value="submit">
	</form>
	<%
	
	String uname =request.getParameter("user");
	Date currentDate = new Date(session.getCreationTime());
	if(uname!=null)
		session.setAttribute("username", uname);
	session.setAttribute("date", currentDate);
	%>
	<a href="session.jsp">Display</a>
</body>
</html>