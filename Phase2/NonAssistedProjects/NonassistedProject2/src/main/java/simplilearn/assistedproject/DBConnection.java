package simplilearn.assistedproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class DBConnection {
	
	static Connection conn=null;
	public static Connection getMyConnection() {
		try{  
			//step1 load the driver class  
			Class.forName("com.mysql.cj.jdbc.Driver"); 
			 
			//step2 create  the connection object 
			 
			conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/ecommerce1","root","Ramyadatta9");  
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	
		return conn;
		
		}

}



