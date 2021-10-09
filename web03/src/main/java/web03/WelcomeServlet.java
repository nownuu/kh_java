package web03;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// 서블릿
// = 사용자가 웹에서 주문할 수 있는 프로그래밍 코드를 보관한 클래스

// 생성과정
// 1. 적합한 부모클래스를 찾아서 상속받는다. - HttpServlet  자격 획득

@WebServlet(urlPatterns = "/welcome.kh")
public class WelcomeServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.getWriter().println("Hello Servlet");
	}
}
