package web05.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import web05.beans.ProductDao;
import web05.beans.ProductDto;

@WebServlet(urlPatterns = "/product/find.kh")
public class ProductFindServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			String column = req.getParameter("column");
			String keyword= req.getParameter("keyword");
			
			boolean searchMode = column != null && !column.equals("") 
								&& keyword != null && !keyword.equals("");
			
			ProductDao productDao = new ProductDao();
			List<ProductDto> list;
			
			if(searchMode) {
				list = productDao.select(column, keyword);
			}
			else {
				list = productDao.select();
			}
		}	catch(Exception e) {
			resp.getWriter().println("ERROR");
			e.printStackTrace();
		}
	}
}
