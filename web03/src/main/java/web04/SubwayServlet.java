package web04;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/subway.kh")
public class SubwayServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		int birth = Integer.parseInt(req.getParameter("birth"));
		int nowYear = 2021;
		int age = nowYear - birth +1;
		
		if(age < 8 || age > 65) {
			resp.getWriter().println("FREE USE Infants & elder");
		} else if(age >= 20) {
			resp.getWriter().println("Adult PRICE = 1250");
		} else if(age >= 14) {
			resp.getWriter().println("Teen PRICE = 720");
		} else {
			resp.getWriter().println("Child PRICE = 450");
		}
	}
}
