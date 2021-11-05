package web07.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import web07.beans.ExamDao;
import web07.beans.ExamDto;

@WebServlet(urlPatterns ="/insert.kh")
public class ExamInsertServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			ExamDto examDto = new ExamDto();
			examDto.setStudent(req.getParameter("student"));
			examDto.setSubject(req.getParameter("subject"));
			examDto.setType(req.getParameter("type"));
			examDto.setScore(Integer.parseInt(req.getParameter("score")));
			
			ExamDao examDao = new ExamDao();
			examDao.insert(examDto);
			
			resp.sendRedirect("insert_success.html");
		}	
		catch(Exception e) {
			e.printStackTrace();
			resp.getWriter().println("error");
		}
	}
}
