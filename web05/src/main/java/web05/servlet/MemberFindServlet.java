package web05.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import web05.beans.MemberDao;
import web05.beans.MemberDto;

@WebServlet(urlPatterns = "/member/find.kh")
public class MemberFindServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			String column = req.getParameter("column");
			String keyword = req.getParameter("keyword");
			
			boolean searchMode = column != null && !column.equals("")
								&& keyword != null && !keyword.equals("");
			
			MemberDao memberDao = new MemberDao();
			List<MemberDto> list;
			
			if(searchMode) {
				list = memberDao.select(column, keyword);
			}
			else {
				list = memberDao.select();
			}
		}	catch(Exception e) {
			e.printStackTrace();
			resp.getWriter().print("ERROR");
		}
	}
}
