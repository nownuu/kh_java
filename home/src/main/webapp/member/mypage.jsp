<%@page import="home.beans.MemberDto"%>
<%@page import="home.beans.MemberDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="/template/header.jsp"></jsp:include>
<!-- 입력 : 현재 로그인한 회원 ID - String memberId -->
<%
	String memberId = (String)session.getAttribute("ses");
%>
<!-- 처리 : 회원정보(MemberDto)-->
<%
	MemberDao memberDao = new MemberDao();
	MemberDto memberDto = memberDao.get(memberId);
%>

<h2>My Page</h2>
<table border ="1" width="350">
	<tbody>
		<tr>
			<th width="45%">ID</th>
			<td><%=memberDto.getMemberId() %></td>
		</tr>
		<tr>
			<th>Nick Name</th>
			<td><%=memberDto.getMemberNick() %></td>
		</tr>
		<tr>
			<th>Birth</th>
			<td><%=memberDto.getMemberBirth() %></td>
		</tr>
		<tr>
			<th>E-mail</th>
			<td><%=memberDto.getMemberEmail() %></td>
		</tr>
		<tr>
			<th>Phone</th>
			<td><%=memberDto.getMemberPhone() %></td>
		</tr>
		<tr>
			<th>Membership Day</th>
			<td><%=memberDto.getMemberJoin() %></td>
		</tr>
		<tr>
			<th>Point</th>
			<td><%=memberDto.getMemberPoint() %></td>
		</tr>
		<tr>
			<th>Grade</th>
			<td><%=memberDto.getMemberGrade() %></td>
		</tr>
	</tbody>
</table>

<h3><a href="password.jsp">Change PassWord</a></h3>
<h3><a href="#">Change Information</a></h3>
<h3><a href="#">Unregister</a></h3>
<jsp:include page="/template/footer.jsp"></jsp:include>