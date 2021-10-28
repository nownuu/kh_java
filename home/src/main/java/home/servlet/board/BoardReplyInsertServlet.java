package home.servlet.board;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import home.beans.BoardDao;
import home.beans.ReplyDao;
import home.beans.ReplyDto;

@WebServlet(urlPatterns="/board/reply/insert.kh")
public class BoardReplyInsertServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			ReplyDto replyDto = new ReplyDto();
			replyDto.setBoardNo(Integer.parseInt(req.getParameter("boardNo")));
			replyDto.setReplyNo(Integer.parseInt(req.getParameter("replyContent")));
			
			replyDto.setReplyWriter((String)req.getSession().getAttribute("ses"));
			
			//처리
			ReplyDao replyDao = new ReplyDao();
			replyDao.insert(replyDto);
			
			BoardDao boardDao = new BoardDao();
			boolean success = boardDao.refreshReplyCount(replyDto.getBoardNo());
			
			// 출력
			resp.sendRedirect("../detail.jsp?boardNo="+replyDto.getBoardNo());
//			resp.sendRedirect(req.getContentPath()+"/board/detail.jsp?boardNo="+replyDto.getBoardNo());
		}	catch(Exception e) {
			e.printStackTrace();
			resp.sendError(500);
		}
	}
}
