<%@page import="home.beans.MemberDto"%>
<%@page import="home.beans.MemberDao"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	String memberId =(String)session.getAttribute("ses");
	
	MemberDao memberDao = new MemberDao();
	MemberDto memberDto = memberDao.get(memberId);
%>
<jsp:include page="/template/header.jsp"></jsp:include>

<h2>Edit Infomation</h2>
<form action="edit.kh" method="post">
	<table>
		<tbody>
			<tr>
				<th>ID</th>
				<td><%=memberDto.getMemberId() %></td>
			</tr>
			<tr>
				<th>PassWord</th>
				<td><input type="password" name="memberPw" ></td>
			</tr>
			<tr>
				<th>NickName</th>
				<td><input type="text" name="memberNick" 
							value="<%=memberDto.getMemberNick() %>" required></td>
			</tr>
			<tr>
				<th>Brith</th>
				<td><input type="date" name="memberBrith"
							value="<%=memberDto.getMemberBirthDay() %>"></td>
			</tr>
			<tr>
				<th>Phone</th>
				<td><input type="text" name="memberPhone" 
							value="<%=memberDto.getMemberPhoneString() %>"></td>
			</tr>
			<tr>
				<th>E-mail</th>
				<td><input type="email" name ="memberEmail"
							value="<%=memberDto.getMemberEmailString() %>"></td>
			</tr>
		</tbody>
		<tfoot>
			<tr>
				<td colspan="2"  align="right">
					<input type="submit" value="¼öÁ¤">
			</tr>
		</tfoot>
	</table>
</form>