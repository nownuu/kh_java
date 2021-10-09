package web04;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;

public class TotalServlet extends HttpServlet{

	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException{
		
		int begin = Integer.parseInt(req.getParameter("begin"));
		int end = Integer.parseInt(req.getParameter("end"));
		
		int total = 0;
		
		for(int i = begin ; i < end ; i++) {
			total += i ;
		}
		
		resp.getWriter().println("total = "+total);
	}
}
