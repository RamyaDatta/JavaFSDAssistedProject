package simplilearn.assistedproject;

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


@WebServlet("/Product")


public class Product extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
    
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Product() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		try {
			//Call Connection Method
				PrintWriter out=response.getWriter();
				Connection con=DBConnection.getMyConnection();
				String id = request.getParameter("id");
			//Write sql command
				String str="select * from eproduct where id="+id;
				
				//to execute query create object of Statement
				Statement  ps=con.createStatement();
				//get ResultSet
				ResultSet ans =ps.executeQuery(str);
				//next method checks for nextrecord
				if(ans.next()) {
					
					out.print("<table border=1 cellpadding=10 cellspacing=0> <thead><tr>");
					out.print("<th>ID</th><th>NAME</th><th>PRICE</th><th>DATE</th>");
					out.print("<tr></thead>");
					out.print("<tbody>");

					
					out.print("<tr>");
					//out.print(rs.getInt(1)+"  "+rs.getString(2)+" "+rs.getBigDecimal(3)+" "+rs.getTimestamp(4)+"<br>");
					out.print("<td>'"+ans.getInt(1)+"'</td><td>'"+ans.getString(2)+"'</td><td>'"+ans.getBigDecimal(3)+"'</td><td>'"+ans.getTimestamp(4)+"'</td>");
					
					out.print("</tr>");
					out.print("</tbody></table>");
					
					
				}
				else {
				out.println("No records found!");
				}
				con.close();
			
			}catch(Exception e) {
				e.printStackTrace();
			}		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
		
	}

	

}
