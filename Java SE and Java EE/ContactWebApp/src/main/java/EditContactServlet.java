

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 * Servlet implementation class EditContactServlet
 */
public class EditContactServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Forwarding to search contact please wait.. ");
		
		RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/edit-contact.jsp");
		
		rd.forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		// Old name taken to change old information.
		String oldS = request.getParameter("name");
		
		// New name and telephone number information.
		String newS = request.getParameter("nameN");
		String newT = request.getParameter("telN");
		//
		request.setAttribute("name",newS);
		request.setAttribute("tel", newT);
		
		// Connection.
		PreparedStatement ps1 = null;
		
		String editQuery = "update contacts set name=?, tel_number=? where name=? ";
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cwa_db", "dbuser", "dbuser123");
			
			ps1 = conn.prepareStatement(editQuery);
			
			ps1.setString(1, newS); // Sets the name to data base.
			ps1.setLong(2, Long.parseLong(newT) ); // Sets the telephone number to data base.
        	ps1.setString(3, oldS); // Makes the changes to old named data
			
            ps1.executeUpdate();
            
            ps1.close();
            conn.close();
			
		}catch(Exception e) {
			
			e.printStackTrace();
			
		}

		
		RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/operation-successful.jsp");
		rd.forward(request, response);
		
	}

}
