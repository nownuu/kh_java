package web05.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import web05.beans.MemberDao;

@WebServlet(urlPatterns = "/member/exit.kh")
public class MemberDeleteServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			//입력 : member테이블 P.K
			String memberId = req.getParameter("memberId");
			
			//처리
			MemberDao memberDao = new MemberDao();
			boolean result = memberDao.delete(memberId);
			
			//출력
			resp.setCharacterEncoding("MS949");
			if(result) {
				resp.getWriter().println("탈퇴 완료. 그동안 감사합니다");
			}
			else {
				resp.getWriter().println("존재하지 않는 회원 ID");
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			resp.getWriter().println("error");
		}
	}
}
