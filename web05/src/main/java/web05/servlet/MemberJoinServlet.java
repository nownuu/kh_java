package web05.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import web05.beans.MemberDao;
import web05.beans.MemberDto;
@WebServlet(urlPatterns = "/member/edit.kh")
public class MemberJoinServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			MemberDto memberDto = new MemberDto();
			memberDto.setMemberId(req.getParameter("member_id"));
			memberDto.setMemberPw(req.getParameter("member_pw"));
			memberDto.setMemberNick(req.getParameter("member_nick"));
			memberDto.setMemberBirth(req.getParameter("member_birth"));
			memberDto.setMemberPhone(req.getParameter("member_phone"));
			memberDto.setMemberEmail(req.getParameter("member_email"));
			
			//처리
			MemberDao memberDao = new MemberDao();
			memberDao.join(memberDto);
			
			//출력
			resp.setCharacterEncoding("MS949");
			resp.getWriter().println("회원 가입 완료");
		}
		catch(Exception e) {//이상한 경우 : Plan B
			e.printStackTrace();
			resp.getWriter().println("error");
		}
	}
}
