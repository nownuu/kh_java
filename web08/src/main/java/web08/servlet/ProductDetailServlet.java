package web08.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import web08.beans.ProductDao;
import web08.beans.ProductDto;

@WebServlet(urlPatterns="/product/detail.kh")
public class ProductDetailServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			String name = req.getParameter("name");
			ProductDao productDao = new ProductDao();
			ProductDto productDto = productDao.select(name);
			
			resp.setCharacterEncoding("MS949");
			if(productDto != null) {
				resp.getWriter().println("상품 번호"+productDto.getNo());
				resp.getWriter().println("상품명"+productDto.getName());
				resp.getWriter().println("상품 유형"+productDto.getType());
				resp.getWriter().println("상품 가격"+productDto.getPrice());
				resp.getWriter().println("제조 일자"+productDto.getMade());
				resp.getWriter().println("유통 기한"+productDto.getExpire());
			}
		}	catch(Exception e) {
			e.printStackTrace();
			resp.getWriter().println("ERROR");
		}
	}
}
