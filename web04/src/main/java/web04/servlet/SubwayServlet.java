package web04.servlet;
import java.io.IOException;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/subway.kh")
public class SubwayServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			//req : 요청 객체. 사용자가 주문한 내용이 들어가 있음
			//resp : 응답 객체. 사용자에게 배송할 내용을 설정할 수 있음.
			
			//입력
			int year = Integer.parseInt(req.getParameter("year"));
			
			//계산
			//int current = Calendar.getInstance().get(Calendar.YEAR);
			int current = LocalDate.now().getYear();
			int age = current - year + 1;
			
			//int price = 1250 or 720 or 450 or 0;
			int price;
			if(age >= 65 || age < 8) {
				price = 0;
			}
			else if(age >= 20) {
				price = 1250;
			}
			else if(age >= 14) {
				price = 720;
			}
			else {
				price = 450;
			}
			
			//출력
			resp.setCharacterEncoding("MS949");
			resp.getWriter().println("나이 : "+age+"세");
			resp.getWriter().println("지하철 요금은 "+price+"원입니다");
		}
		catch(Exception e) {
			resp.setCharacterEncoding("MS949");
			resp.getWriter().println("처리 오류 발생");
			//e.printStackTrace();
		}
	}
}
