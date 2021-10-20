package home.servlet.member;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import home.beans.MemberDao;

@WebServlet(urlPatterns="/member/quit.kh")
public class MemberQuitServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			req.setCharacterEncoding("UTF-8");
			String memberId = (String)req.getSession().getAttribute("ses");
			
			MemberDao memberDao = new MemberDao();
			boolean result = memberDao.quit(memberId);
			
			req.getSession().removeAttribute("ses");
			resp.sendRedirect("quit_success.jsp");
//			resp.sendRedirect(req.getContextPath()+"/member/quit_success.jsp");	
		}	catch(Exception e) {
			e.printStackTrace();
			resp.sendError(500);
		}
	}
}
