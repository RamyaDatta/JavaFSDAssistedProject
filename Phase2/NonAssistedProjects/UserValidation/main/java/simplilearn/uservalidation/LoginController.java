package simplilearn.uservalidation;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;

@WebServlet("/LoginController")
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
        public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }
        protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String username= request.getParameter("username");
		String password= request.getParameter("password");
		
		RequestDispatcher rd= null;
		if(username.equalsIgnoreCase("simplilearn") && password.equals("jerry")) {
			rd=request.getRequestDispatcher("SuccessServlet");
			rd.forward(request, response);
		}else {
			
			rd=request.getRequestDispatcher("index.html");
			PrintWriter out=response.getWriter();
			rd.include(request, response);
			
			out.println("<center> <span style='color:red'>Invalid Credentials!!</span></center>");
}}

}
