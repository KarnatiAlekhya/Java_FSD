package ProductDetails;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/ProductInfo")
public class ProductInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;
 protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	 try {
			PrintWriter out=response.getWriter();
			response.setContentType("text/html");
			out.println("<html><body>"); 
			// get connection
			Connection con=DatabaseConnection.getConnection();
			
			// create sql command
			String sql="select * from productdetails"; 
			Statement stmt=con.createStatement();

			out.println("<table border=1 width=50% height=10%>"); 
			out.println("<tr><th>productid</th><th>productname</th><th>price</th><th>quantity</th></tr>"); 
			
			//Execute query and stored in resultset
			ResultSet result=stmt.executeQuery(sql);
			
			//Read records from resultset
			while(result.next()) {
				out.println("<tr><td>"+result.getInt("productid")+"<td>"+result.getString("productname")+"<td>"+result.getInt("price")+"<td>"+result.getInt("quantity"));		}
			 	out.println("</table>");  
			 	out.println("</html></body>");  
			 	con.close(); 
			}
			catch (Exception e) {
				e.printStackTrace();
			}}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}}


