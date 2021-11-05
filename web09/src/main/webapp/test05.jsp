<%@page import="web09.beans.ExamDto"%>
<%@page import="java.util.List"%>
<%@page import="web09.beans.ExamDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	ExamDao examDao = new ExamDao();
	List<ExamDto> list = examDao.select();
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Exam List</title>
</head>
<body>
	<h1>시험 목록</h1>
	<!-- 테이블 구성 -->
	<table border="1"	style="width :570">
		<thead>
			<tr>
				<th>시험 아이디</th>
				<th>학생명</th>
				<th>과목명</th>
				<th>시험 유형</th>
				<th>시험 성적</th>
			</tr>
		</thead>
		<tbody align="center">
			<%for(ExamDto examDto : list){ %>
		<tr>
				<td><%=examDto.getExamId()%></td>
				<td><%=examDto.getStudent()%></td>
				<td><%=examDto.getSubject()%></td>
				<td><%=examDto.getType()%></td>
				<td><%=examDto.getScore()%></td>
		</tr>
			<%} %>
		</tbody>
	</table>
	
</body>
</html>