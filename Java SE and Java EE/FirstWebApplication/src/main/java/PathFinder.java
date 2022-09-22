

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class PathFinder
 */
@WebServlet("/pathfinder")
public class PathFinder extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	// TODO Auto-generated method stub
    	super.service(request, response);
    }
    
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//Ex10
		/*
		response.getWriter().println("Results:");
		response.getWriter().println(request.getRequestURL());
		response.getWriter().println(request.getRequestURI());
		response.getWriter().println(request.getServletPath());
		response.getWriter().println(request.getContextPath());
		response.getWriter().println(request.getPathInfo());
		response.getWriter().println(request.getQueryString());
		*/
		
		//Ex11
		String ReqURL = request.getRequestURL().toString();
		boolean contains = false;
		
		for(String i : ReqURL.split("/")) {
			
			if( i.equalsIgnoreCase("secured") ) {
				contains = true;
			}
			
		}
		
		if(contains) {
			
			// Response is actually servlet respınse
			HttpServletResponse rsp = (HttpServletResponse) response;
			
			rsp.sendError(HttpServletResponse.SC_FORBIDDEN);
			
			//response.setStatus(403); Yeterliymis
			
			
		}else {
			//RequestDispatcher rd = request.getRequestDispatcher("path.?");
			response.sendRedirect("PathFinderStatic.html");
			
		}
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
