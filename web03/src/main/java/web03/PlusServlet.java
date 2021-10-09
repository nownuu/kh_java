package web03;

import java.io.IOException;
import java.util.Scanner;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

// 사용자가 전달한 두 개의 숫자를 합쳐서 화면에 출력하는 페이지
@WebServlet(urlPatterns = "/plus.kh")
public class PlusServlet extends HttpServlet{

	@Override
	public void service(ServletRequest req, ServletResponse resp) throws ServletException, IOException {
		// 입력 - 스캐너 사용 금지
		// 웹페이지에서의 입력은 주소를 통해서 파라미터로 전달된다.
		// = 주소에 ?가 있다면 그 뒷부분으 파라미터라고 보면 된다.
		// 모든 파라미터는 무조건 String 으로만 읽힌다.
		// 숫자로 바꾸고 싶다면 변환명령을 추가로 작성해야한다.
		
		int a =Integer.parseInt(req.getParameter("a"));
		int b = Integer.parseInt(req.getParameter("b"));
		
		int total = a + b;
		
		resp.getWriter().println("total : "+total);
	}
}
