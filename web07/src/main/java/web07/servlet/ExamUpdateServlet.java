package web07.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import web07.beans.ExamDao;
import web07.beans.ExamDto;

@WebServlet(urlPatterns="/update.kh")
public class ExamUpdateServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			ExamDto examDto = new ExamDto();
			examDto.setExamId(Integer.parseInt(req.getParameter("examId")));
			examDto.setStudent(req.getParameter("student"));
			examDto.setSubject(req.getParameter("subject"));
			examDto.setType(req.getParameter("type"));
			examDto.setScore(Integer.parseInt(req.getParameter("score")));
			
			ExamDao examDao = new ExamDao();
			boolean success = examDao.update(examDto);
			
			if(success) {
				resp.sendRedirect("update_success.html");
			}
			else {
				resp.sendRedirect("update_fail.html");
			}
		}	catch(Exception e) {
			e.printStackTrace();
			resp.getWriter().println("error");
		}
	}
}
