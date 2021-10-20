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
import javax.servlet.http.HttpSession;

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
		
		HttpSession session = ((HttpServletRequest) request).getSession();
		if(session.getAttribute("memberId") != null) {
			chain.doFilter(request, response);
		}
		else {
			((HttpServletResponse) request).sendRedirect("/member/login.jsp");
		}
	}
}
