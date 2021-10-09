package web03;

import java.io.IOException;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/dice.kh")
public class DiceServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		Random r = new Random();
		for(int i = 1 ; i <= 1 ; i ++) {
			int dice = r.nextInt(6)+1;
		resp.setCharacterEncoding("UTf-8");
		resp.getWriter().println(dice);
		}
	}
}
