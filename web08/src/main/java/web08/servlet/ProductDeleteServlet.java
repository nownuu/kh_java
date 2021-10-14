package web08.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import web08.beans.ProductDao;

@WebServlet(urlPatterns="/product/delete.kh")
public class ProductDeleteServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			int no = Integer.parseInt(req.getParameter("no"));
			
			ProductDao productDao = new ProductDao();
			boolean success = productDao.delete(no);
			
			if(success) {
				resp.sendRedirect("delete_success.html");
			}
			else {
				resp.sendRedirect("delete_fail.html");
			}
		}	catch(Exception e) {
			e.printStackTrace();
			resp.getWriter().println("ERROR");
		}
	}
}
