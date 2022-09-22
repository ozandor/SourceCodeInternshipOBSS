

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

/**
 * Servlet implementation class LoginServlet
 */
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private String user_name = "admin";
	
	private String pass_word = "a123";


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		if(user_name.equals(request.getParameter("usr")) && pass_word.equals(request.getParameter("psw")) ) {
			
			HttpSession session = request.getSession();
			//session.putValue("isUserLoggedIn", Boolean.TRUE); //Deprecated.
			session.setAttribute("isUserLoggedIn", Boolean.TRUE);		
			session.setAttribute("username",request.getParameter("usr"));
			//request.setAttribute("isUserLoggedIn", Boolean.TRUE);
			response.getWriter().print("Welcome.");
		
		
		}else {
			
			response.getWriter().print("False credentials.");

		}
		
		
	
	}

}
