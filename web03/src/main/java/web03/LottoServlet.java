package web03;

import java.io.IOException;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

	@WebServlet(urlPatterns = "/lotto.kh")
	public class LottoServlet extends HttpServlet{
		@Override
		protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

			Random r = new Random();
	        Set<Integer> lotto = new TreeSet<>();
	        
	        while(lotto.size() < 6) {
	        	lotto.add(r.nextInt(45)+1);
	        }
	        resp.setCharacterEncoding("UTf-8");
	        resp.getWriter().println(lotto);
	}
}
