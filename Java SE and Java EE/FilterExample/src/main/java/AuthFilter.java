

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

/**
 * Servlet Filter implementation class AuthFilter
 */
@WebFilter("/private/*")
public class AuthFilter implements Filter {
 

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		
		HttpServletRequest req = (HttpServletRequest) request;
		HttpServletResponse res = (HttpServletResponse) response;
		
		HttpSession session = req.getSession(false);
		
		//response.getWriter().printf("Testtt::: "+ session.getAttribute("isUserLoggedIn"));
		if(session == null) {
			
			res.sendRedirect(req.getContextPath()+"/public/login.jsp");	
			
		}else if(session.getAttribute("isUserLoggedIn") == null) {
			
			res.sendRedirect(req.getContextPath()+"/public/login.jsp");	
			
		}
		else if( ! (boolean)session.getAttribute("isUserLoggedIn") ) { // If user not logged in
			
			res.sendRedirect(req.getContextPath()+"/public/login.jsp");
			
		}else {
			
			// pass the request along the filter chain
			chain.doFilter(request, response);
			
		}
		
	
		
	}

}
