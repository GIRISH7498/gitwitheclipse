package serv;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/que5_nameServlet")
public class que5_nameServlet extends HttpServlet 
{
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String name = request.getParameter("name");
		try(PrintWriter out = response.getWriter();)
		{
			response.setContentType("html");
			out.print("welcome "+name);
		}
	}
}
