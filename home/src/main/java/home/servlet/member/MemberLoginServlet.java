package home.servlet.member;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import home.beans.MemberDao;
import home.beans.MemberDto;

@WebServlet(urlPatterns="/member/login.kh")
public class MemberLoginServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			
			req.setCharacterEncoding("UTF-8");
			String memberId = req.getParameter("memberId");
			String memberPw = req.getParameter("memberPw");
			
			MemberDao memberDao = new MemberDao();
			MemberDto memberDto = memberDao.get(memberId);
			
			boolean login = false;
			if(memberDto != null && memberDto.getMemberId().equals(memberPw)) {
				
				req.getSession().setAttribute("ses", memberId);
				req.getSession().setAttribute("grade", memberDto.getMemberGrade()); //관리자
				resp.sendRedirect(req.getContextPath()+"/index.jsp");
			}
			else {
				resp.sendRedirect("login.jsp?error");
			}
		}	catch(Exception e) {
			e.printStackTrace();
			resp.sendError(500);
		}
	}
}
