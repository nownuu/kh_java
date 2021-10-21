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
		"/member/check.jsp", "/member/quit.kh",
		"/point/*"
})
public class MemberFilter implements Filter{
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest)request;
		HttpServletResponse resp = (HttpServletResponse)response;
		
		//회원인지 아닌지 판정하는 코드
		String memberId = (String)req.getSession().getAttribute("ses");
		boolean login = memberId != null;
		
		if(login) {//회원이라면 --> 통과
			chain.doFilter(request, response);
		}
		else {
			resp.sendError(401);
		}
	}
}
