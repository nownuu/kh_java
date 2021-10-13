package web07.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import web07.beans.ExamDao;

@WebServlet(urlPatterns = "/delete.kh")
public class ExamDeleteServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			int examId = Integer.parseInt(req.getParameter("examId"));

			ExamDao examDao = new ExamDao();
			boolean success = examDao.delete(examId);
			
			if(success) {
				resp.sendRedirect("delete_success.html");
			}
			else {
				resp.sendRedirect("delete_fail.html");
			}
		}
		catch(Exception e) {
			e.printStackTrace();
			resp.getWriter().println("error");
		}
	}
}
