import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Servlet")
public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType ("text/html"); // the content’s MIME type
	     String name = request.getParameter("Firstname");
	     String Last = request.getParameter("Lastname");
		if (name.equals("") || Last.equals("") )
		{
			response.sendRedirect("errorPage.html");
		}
		else
         response.sendRedirect("Welcome.html");
	}
}
