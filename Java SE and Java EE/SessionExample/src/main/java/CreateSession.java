

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class CreateSession for ex16
 */
@WebServlet("/create-session")
public class CreateSession extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// Checked on browser for part 1 and part 2.
		/*
		response.getWriter().print("\n"+request.getSession()); // Gives session
		response.getWriter().print("\n"+request.getSession(false)); // Gives null
		*/
		
		request.getSession().setAttribute("123", "456");
		
		// Part 3 and Part 4
		/*
		RequestDispatcher rd = request.getRequestDispatcher("/list-session-attributes");
		
		rd.forward(request, response); // Gives the session name but not value(as null)
		*/
		response.sendRedirect("list-session-attributes"); // same as forward
		
		// Part 5
		/*
		RequestDispatcher rd1 = request.getRequestDispatcher("/invalidate-session");
		
		rd1.forward(request, response);
		*/
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		doGet(request, response);
	}

}
