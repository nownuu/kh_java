package web08.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import web08.beans.ProductDao;
import web08.beans.ProductDto;

@WebServlet(urlPatterns="/product/search.kh")
public class ProductSearchServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		try {
			String column = req.getParameter("column");
			String keyword = req.getParameter("keyword");
			
			boolean search = column != null && keyword != null;
			
			ProductDao productDao = new ProductDao();
			List<ProductDto> list;
			if(search) {
				list= productDao.select(column, keyword);
			}
			else {
				list=productDao.select();
			}
			
			resp.setCharacterEncoding("MS949");
			resp.getWriter().println("검색 결과 : "+list.size());
			for(ProductDto productDto : list) {
			resp.getWriter().println("상품 번호 : "+productDto.getNo());
			resp.getWriter().println("상품 명 : "+productDto.getName());
			resp.getWriter().println("상품 유형 : "+productDto.getType());
			resp.getWriter().println("상품 가격 : "+productDto.getPrice());
			resp.getWriter().println("제조 일자 : "+productDto.getMade());
			resp.getWriter().println("유통 기한 : "+productDto.getExpire());
			}
		}	catch(Exception e) {
			e.printStackTrace();
			resp.getWriter().println("ERROR");
		}
	}
}
