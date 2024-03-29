package home.servlet.point;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import home.beans.CoinDao;
import home.beans.CoinDto;

@WebServlet(urlPatterns="/admin/point/edit.kh")
public class CoinEditServlet extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			//입력
			CoinDto coinDto = new CoinDto();
			coinDto.setCoinNo(Integer.parseInt(req.getParameter("coinNo")));
			coinDto.setCoinName(req.getParameter("coinName"));
			coinDto.setCoinAmount(Integer.parseInt(req.getParameter("coinAmount")));
			//처리
			CoinDao coinDao = new CoinDao();
			boolean success =  coinDao.edit(coinDto);
			//출력
			resp.sendRedirect("list.jsp");
		}	catch(Exception e) {
			e.printStackTrace();
			resp.sendError(500);
		}
	}
}
