

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
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.obss.cwaj.Contact;

/**
 * Servlet implementation class SearchContactServlet
 */
public class SearchContactServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Forwarding to search contact please wait.. ");
		
		RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/search-contact.jsp");
		
		rd.forward(request, response);
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// Getting the name from user to search data base.
		String sName = request.getParameter("name");
		
		String selectQuery = "select * from contacts where LOWER(name) like ?";
		
		PreparedStatement ps1 = null;
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/cwa_db", "dbuser", "dbuser123");
			
			ps1 = conn.prepareStatement(selectQuery);
			
			ps1.setString(1, sName);
			
            ResultSet rs = ps1.executeQuery();
            
            List<Contact> cList = new ArrayList<>();
            
            while (rs.next()) {

				String arrName = rs.getString("name");
				
				long arrTel = rs.getLong("tel_number");
				
				cList.add(new Contact(arrName, arrTel));
			
            }
            
            for(Contact i : cList) {
            	
            	request.setAttribute("name", "Searched Name: " + i.getName());
            	request.setAttribute("tel_number", "Searched Number: " + i.getTelNum());
            }
            
            if(null == request.getAttribute("name")) {
            	
            	request.setAttribute("name", "Contact not found! Try new name.");
            	
            }
            
            
            
            ps1.close();
            conn.close();
			
		}catch(Exception e) {
			
			e.printStackTrace();
			
		}
		
		RequestDispatcher rd = request.getRequestDispatcher("WEB-INF/search-contact.jsp");
		rd.forward(request, response);
		
	}

}
