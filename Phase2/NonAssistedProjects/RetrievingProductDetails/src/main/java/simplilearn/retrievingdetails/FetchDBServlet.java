package simplilearn.retrievingdetails;

import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import simplilearn.retrievingdetails.DBConfig;

@WebServlet("/list")


public class FetchDBServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		
		
		PrintWriter out=resp.getWriter();
		resp.setContentType("text/html");
		
		String  param=req.getParameter("id");
		//converting string to int
		int  id=  Integer.parseInt(param);
		
		Properties props= new Properties();
		
		InputStream  in= getServletContext().getResourceAsStream("/WEB-INF/application.properties");
		props.load(in);
	
		Connection  conn=DBConfig.getConnection(props);
	
		
		//Connection conn= DBConfig.getConnection(props);
		
		
		if(conn!=null) {
			
			//Statement stmt;
			try {
				String str="select * from eproduct where id="+id;
				
				//to execute query create object of Statement
				Statement  ps=conn.createStatement();
				//get ResultSet
				ResultSet ans =ps.executeQuery(str);
				//next method checks for nextrecord

				
				/*out.print("<table border=1 cellpadding=10 cellspacing=0> <thead><tr>");
				out.print("<th>ID</th><th>NAME</th><th>PRICE</th><th>DATE</th>");
				out.print("<tr></thead>");
				out.print("<tbody>");*/
				
				if(ans.next()) {
					
					out.println(ans.getInt(1)+"  "+ans.getString(2)+"   "
							+ans.getBigDecimal(3)+"    "
							+ans.getTimestamp(4)+"<br>");
				}
				//out.print("</tbody></table>");
				else {
					System.out.println("Error while retrieving a data");
					//resp.sendRedirect("list");
					out.println("No records found!");
				}
				
				/*out.print("</tbody></table>");*/
				//conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
		else {
			
			out.print("Error While Connecting Connections");
		}
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(req, resp);
	}

	
	

}
