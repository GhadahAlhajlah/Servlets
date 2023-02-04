import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Servlet")
public class Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public Servlet1() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType ("text/html"); // the content’s MIME type
		PrintWriter out = response.getWriter(); // access the output stream
		String name = request.getParameter("Firstname");
		String Last = request.getParameter("Lastname");
		out.println ("<HTML>");
		out.println ("<HEAD><TITLE>Verify Form</TITLE></HEAD>");
		out.println ("<BODY>");
		out.println ("<H1>Hello "+ name + " "+Last+"</H1>");
		out.println ("</BODY>");
		out.println ("</HTML>");

	}

	
}
