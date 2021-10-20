package home.servlet.member;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import home.beans.CoinDao;
import home.beans.CoinDto;

@WebServlet(urlPatterns="/point/charge.jsp")
public class CoinCharge extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		try {
			CoinDao coinDao = new CoinDao();
			List<CoinDto> list = coinDao.list();
			
			resp.setCharacterEncoding("UTF-8");
			for(CoinDto coinDto	 : list) {
				resp.sendRedirect(req.getContextPath());
			}
		} catch (Exception e) {
			e.printStackTrace();
			resp.sendError(500);
		}
		
	}
}
