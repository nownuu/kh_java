package home.servlet.point;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import home.beans.CoinDao;

@WebServlet(urlPatterns="/admin/point/delete.kh")
public class CoinDeleteServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			//입력
			int coinNo = Integer.parseInt(req.getParameter("coinNo"));
			//처리
			CoinDao coinDao = new CoinDao();
			boolean success = coinDao.delete(coinNo);
			
			//출력
			resp.sendRedirect("list.jsp");
		} catch(Exception e) {
			e.printStackTrace();
			resp.sendError(500);
		}
	}
}
