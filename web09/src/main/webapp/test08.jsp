<%@page import="web09.beans.MemberDto"%>
<%@page import="java.util.List"%>
<%@page import="web09.beans.MemberDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String column = request.getParameter("column");
	String keyword = request.getParameter("keyword");
%>
<%	
	boolean search = column != null && keyword != null;
	
	MemberDao memberDao = new MemberDao();
	List<MemberDto> list;
	
	if(search){
		list = memberDao.search(column, keyword);
	}
	else{
		list=memberDao.list();
	}
	
	String title;
	if(search){
		title = "회원 검색";
	}
	else{
		title = "회원 목록";
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Member Select</title>
</head>
<body>
	<h1>회원 정보 목록</h1>
<form action="test08.jsp">
	<fieldset>
		<legend>회원 검색</legend>
			<select name = "column">
				<option value ="memberId">아이디</option>
				<option value ="memberNick">닉네임</option>
			</select>
			<input type="search" name="keyword">
			<input type="submit" value="검색">
	</fieldset>
</form>

<table  border="1">
	<thead align ="center">
		<tr>
			<th>Member ID</th>
			<th>Member Nick</th>
			<th>Member birth</th>
			<th>Member Phone</th>
			<th>Member Email</th>
			<th>Member join</th>
			<th>Member Point</th>
		</tr>
	</thead>
	
	<tbody align = "center">
		<% for(MemberDto memberDto : list){ %>
			<tr>
				<td><%=memberDto.getMemberId() %></td>
				<td><%=memberDto.getMemberNick() %></td>
				<td><%=memberDto.getMemberBirth().substring(0, 10) %></td>
				<td><%=memberDto.getMemberPhone() %></td>
				<td><%=memberDto.getMemberEmail() %></td>
				<td><%=memberDto.getMemberJoin() %></td>
				<td><%=memberDto.getMemberPoint() %></td>
			</tr>
		<%} %>
	</tbody>
</table>
</body>
</html>