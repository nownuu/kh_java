package web05.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import web05.beans.ExamDao;
import web05.beans.ExamDto;

@WebServlet(urlPatterns = "/exam/insert.kh")
public class ExamInsertServlet extends HttpServlet {
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
		// 입력 : 
		ExamDto examDto = new ExamDto();
		examDto.setStudent(req.getParameter("student"));
		examDto.setSubject(req.getParameter("subject"));
		examDto.setType(req.getParameter("type"));
		examDto.setScore(Integer.parseInt(req.getParameter("score")));
		
		// 처리 : 데이터베이스 테이블(exam) 추가 작업
		ExamDao examDao = new ExamDao();
				examDao.insert(examDto);
		
		// 출력
			resp.setCharacterEncoding("MS949");
			resp.getWriter().print("시험 정보 등록 완료");
		} catch(Exception e) {
			resp.setCharacterEncoding("MS949");
			resp.getWriter().print("처리 오류 발생");
			e.printStackTrace();
		}
	}
}
