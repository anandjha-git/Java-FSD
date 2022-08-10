<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>visitcount</title>
</head>
<body>
<%@ page import = "java.io.*,java.util.*" %>

<html>
   <head>
      <title>Visit in application</title>
   </head>
   
   <body>
   
      <%
         Integer hitsCount = (Integer)application.getAttribute("hitCounter");
         if( hitsCount ==null || hitsCount == 0 ) {
            out.println("Welcome user");
            hitsCount = 1;
         } else {
            out.println("Welcome back ");
            hitsCount += 1;
         }
         application.setAttribute("hitCounter", hitsCount);
      %>
      <center>
         <p>Total no. of visits  <%= hitsCount%></p>
      </center>
   <a href ="visitcount.jsp">Visit Again</a>
   </body>
</html>
</body>
</html>