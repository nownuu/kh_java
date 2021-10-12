package web05.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import web05.beans.ExamDao;
import web05.beans.ExamDto;

@WebServlet(urlPatterns = "/exam/find.kh")
public class ExamFindServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			String column = req.getParameter("column");
			String keyword = req.getParameter("keyword");
			
			boolean searchMode = column != null && !column.equals("")&&keyword != null && !keyword.equals("");
			ExamDao examDao = new ExamDao();
			List<ExamDto> list;
			
			if(searchMode) {
				list = examDao.select(column, keyword);
			}
			else {
				list = examDao.select();
			}
		}	catch(Exception e) {
			e.printStackTrace();
			resp.getWriter().print("ERROR");
		}
	}
}
