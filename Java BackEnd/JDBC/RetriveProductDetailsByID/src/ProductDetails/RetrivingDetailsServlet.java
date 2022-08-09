package ProductDetails;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/RetrivingDetailsServlet")
public class RetrivingDetailsServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		PrintWriter out=resp.getWriter();
		resp.setContentType("text/html");
		
		String  param=req.getParameter("productId");
		//converting string to int
		int  productId=  Integer.parseInt(param);
		
		Properties props= new Properties();
		
		InputStream  in= getServletContext().getResourceAsStream("/WEB-INF/application.properties");
		props.load(in);
	
		Connection  conn=DBConfig.getConnection(props);
		
		if(conn!=null) {
			
			try {
				
				
				PreparedStatement stmt=conn.prepareStatement("select * from product where productId=?");
				stmt.setInt(1, productId);
				
				out.print ("<table width=50% border=1>");
	            out.print ("<caption>Product Details:</caption>");
				
				ResultSet rs=stmt.executeQuery();
				
				/* Printing column names */
	           out.print ("</br></br>");
	            ResultSetMetaData rsmd = rs.getMetaData ();
	           int total = rsmd.getColumnCount ();
	            out.print ("<tr>");
	            for (int i = 1; i <= total; i++)
	         {
	             out.print ("<th>" + rsmd.getColumnName (i) + "</th>");
	         }
	            out.print ("</tr>");
	            /* Printing result */
	          while (rs.next ())
	         {
	             out.print ("<tr><td>" + rs.getInt (1) + "</td><td>" +  rs.getString (2) + " </td><td>" + rs.getInt (3) + "</td></tr>");
	         }
	            out.print ("</table>");
				
				
				
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		else {
			out.println("Error while Connecting");
		}
		
	}
		
		
		

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}
	
	

}