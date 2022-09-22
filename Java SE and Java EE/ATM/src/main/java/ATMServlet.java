

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class ATMServlet
 */
@WebServlet("/atm")
public class ATMServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private static int currentMoney = 500;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.service(request, response);
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
	
		try {
			
			int tempMoney = Integer.parseInt(request.getParameter("money"));
			
			if(0 <= (currentMoney-tempMoney) ) {
				Thread.sleep(10000);
				currentMoney -= tempMoney;
				
				response.getWriter().println("\nMoney is given.\nCurrent money"+currentMoney);
				
			}else{
				response.getWriter().println("\nNot enough money.");
			}
			
		}catch(Exception e) {
			response.getWriter().println("\nExcption:"+e);
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
