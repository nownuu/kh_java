package web05.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import web05.beans.ProductDao;
@WebServlet(urlPatterns = "/product/delete.kh")
public class ProductDeleteServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			int productNo = Integer.parseInt(req.getParameter("no"));
			
			ProductDao productDao = new ProductDao();
			boolean success = productDao.delete(productNo);
			
			resp.setCharacterEncoding("MS949");
			if(success) {
				resp.getWriter().println("시험 정보 삭제 성공");
			}
			else {
				resp.getWriter().println("존재하지 않는 시험지 번호");
			}
			
		}	catch(Exception e) {
			resp.getWriter().print("ERROR");
			e.printStackTrace();
		}
	}
}
