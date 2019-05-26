

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/NumberSearch")
public class NumberSearch extends HttpServlet {
	private static final long serialVersionUID = 1L;
	  static Connection con;
	    
    public NumberSearch() {
        super();
        try {
			Class.forName(Constants.driver);
			 con=DriverManager.getConnection(Constants.url, Constants.username, Constants.password);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String number=request.getParameter("number");
		String query="select * from telephone where ph_no=\""+number + "\";";
		try {
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery(query);
			if(rs.isBeforeFirst()) {
				response.getWriter().append("\nphone\t name \t address\t company \t pin \n");
				while(rs.next()) {
					response.getWriter()
					.append("\n" + rs.getString("ph_no"))
					.append("\t" + rs.getString("name"))
					.append("\t" + rs.getString("address"))
					.append("\t" + rs.getString("company"))
					.append("\t" + rs.getString("pin"));
				}
			}
			else {
				response.getWriter().append("No matching Entry found");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
