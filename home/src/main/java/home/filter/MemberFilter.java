package home.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebFilter(urlPatterns = {
		"/member/logout.kh",
		"/member/mypage.jsp",
		"/member/edit.jsp",	"/member/edit.kh",	"/member/edit_success.jsp",
		"/member/password.jsp", "/member/password.kh", "/member/password_success.jsp",
		"/member/check.jsp", "/member/quit.kh"
})
public class MemberFilter implements Filter{
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest)request;
		HttpServletResponse resp = (HttpServletResponse)response;
		
		String memberId = (String)req.getSession().getAttribute("ses");
		boolean login = memberId != null;
		
		if(login) {
			chain.doFilter(request, response);
		}
		else {
			//resp.sendRedirect(req.getContextPath()+"/member/login.jsp");
			resp.sendError(401);
		}
	}
}
