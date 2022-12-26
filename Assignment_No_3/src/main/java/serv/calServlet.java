package serv;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/calServlet")
public class calServlet extends HttpServlet
{
	private static final long serialVersionUID = 1L;
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		int n1=Integer.parseInt(request.getParameter("num1"));
		int n2=Integer.parseInt(request.getParameter("num2"));
		
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		out.println("result");
		String op=request.getParameter("Operation");
		
		if (op.equals("add")) 
		{
			int res=n1+n2;
			out.print("<h3>The Addition is: "+res+" </h3>");
		}
		else if (op.equals("sub")) 
		{
			int res=n1-n2;
			out.print("<h3>The Subtraction  is: "+res+" </h3>");
		}
		else if (op.equals("mul"))
		{
			int res=n1*n2;
			out.print("<h3>The Multiplication is: "+res+" </h3>");
		}
		else if (op.equals("div")) 
		{
			int res=n1/n2;
			out.print("<h3>The Division is: "+res+" </h3>");
		}
	}
}
//hellooooooo go to the eclip