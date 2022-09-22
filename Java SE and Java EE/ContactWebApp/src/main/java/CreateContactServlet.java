

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

import com.obss.cwaj.Contact;

/**
 * Servlet implementation class CreateContactServlet
 */
public class CreateContactServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Forwarding to create contact please wait.. ");
		RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/create-contact.jsp");
		rd.forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// Getting parameters from user's inputs.
		String cName = request.getParameter("name"); 
		long cTel = Long.parseLong(request.getParameter("tel_number"));
		
		// Creating contact object.
		Contact c1 = new Contact(cName,cTel);
		
		request.setAttribute("name",cName);
		request.setAttribute("tel", cTel);
		
		// Connection.
		PreparedStatement ps1 = null;
		
		String insertQuery = "insert into contacts(id, name, tel_number) values(?, ?, ?)";
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cwa_db", "dbuser", "dbuser123");
			
			ps1 = conn.prepareStatement(insertQuery);
			
			ps1.setInt(1, c1.getID()); // Sets the id to data base.
			ps1.setString(2, c1.getName()); // Sets the name to data base.
        	ps1.setLong(3, c1.getTelNum()); // Sets the telephone number to data base.
			
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
