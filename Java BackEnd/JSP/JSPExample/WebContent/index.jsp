<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>login</h1>
<!-- 
	<form method="get" action="index.jsp">
		Enter Uname:<input type="text" name="user" required><br />
		Enter Password:<input type="password" name="pass" required><br />
		<input type="submit" value="check">
	</form>
	-->
	<form method="get" action="index.jsp">
		Enter Uname:<input type="text" name="name" required><br />
		Enter Age:<input type="text" name="age" required><br />
		<input type="submit" value="check">
	</form>
	<%
	String uname = request.getParameter("name");
	String Uage = request.getParameter("age");
	
	String ypass= uname.concat(Uage);
	out.println("welcome" + uname+ "Your Password is "+ypass);
		
	
	%>
	
	<%!boolean validate(String uname, String pass) {
		if (uname.equalsIgnoreCase("anand") && pass.equals("anand@123")) {
			return true;
		}
		return false;
	}%>
	<%
	String uname1 = request.getParameter("user");
	String password = request.getParameter("pass");
	if (uname != null && password != null) {
		if (validate(uname1, password))
			out.println("welcome" + uname);
		else
			out.println("invalid username & password");
	}
	%>
</body>
</html>