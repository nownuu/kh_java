package web08.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import web08.beans.ProductDao;
import web08.beans.ProductDto;

@WebServlet(urlPatterns="/product/update.kh")
public class ProductUpdateServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			ProductDto productDto = new ProductDto();
			productDto.setName(req.getParameter("name"));
			productDto.setType(req.getParameter("type"));
			productDto.setPrice(Integer.parseInt(req.getParameter("price")));
			productDto.setMade(req.getParameter("made"));
			productDto.setExpire(req.getParameter("expire"));
			
			ProductDao productDao = new ProductDao();
			boolean success = productDao.update(productDto);
			
			if(success) {
				resp.sendRedirect("update_success.html");
			}
			else {
				resp.sendRedirect("update_fail.html");
			}
		}	catch(Exception e) {
			e.printStackTrace();
			resp.getWriter().println("ERROR");
		}
	}
}
