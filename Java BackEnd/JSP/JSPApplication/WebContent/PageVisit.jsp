<%@ page import = "java.io.*,java.util.*" %>

<html>
   <head>
      <title>Visit in application</title>
   </head>
   
   <body>
      <%
         Integer hitsCount = (Integer)application.getAttribute("hitCounter");
         if( hitsCount ==null || hitsCount == 0 ) {
            /* First visit */
            out.println("Welcome user");
            hitsCount = 1;
         } else {
            /* return visit */
            out.println("Welcome back ");
            hitsCount += 1;
         }
         application.setAttribute("hitCounter", hitsCount);
      %>
      <center>
         <p>Total no. of visits  <%= hitsCount%></p>
      </center>
   
   </body>
</html>