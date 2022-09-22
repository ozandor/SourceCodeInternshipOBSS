

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

/**
 * Servlet implementation class ListSessionAttributes
 */
@WebServlet("/list-session-attributes")
public class ListSessionAttributes extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Enumeration<String> sessionEnum = request.getSession(false).getAttributeNames();// not null safe
		
		response.getWriter().println("\nList of the sessions:");
		
		while(sessionEnum.hasMoreElements()) {
			
			String tempSess = (String) sessionEnum.nextElement();
			response.getWriter().println("Name:" + tempSess + " Value:" + request.getAttribute(tempSess));
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
