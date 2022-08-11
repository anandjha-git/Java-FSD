

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/ProductsServlet")
public class ProductsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int Quantity = Integer.parseInt(request.getParameter("Quantity"));
		int Price = Integer.parseInt(request.getParameter("Price"));
		String Pname = request.getParameter("Pname");
	
		PrintWriter out= response.getWriter();
		HttpSession session = request.getSession();
		session.setAttribute("Pname", Pname);
		session.setAttribute("Quantity", Quantity);
		session.setAttribute("Price", Price);
		out.print("<h1>Click to get details </h1>");
		out.print("<a href='index.jsp'><button> Your records is Here..</button></a>");
	}

}