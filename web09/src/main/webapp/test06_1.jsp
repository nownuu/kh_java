<%@page import="web09.beans.ExamDto"%>
<%@page import="java.util.List"%>
<%@page import="web09.beans.ExamDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String column = request.getParameter("column");
	String keyword = request.getParameter("keyword");
	
	boolean search = column != null && keyword != null;
	
	ExamDao examDao = new ExamDao();
	List<ExamDto> list;
	if(search){
		list=examDao.select(column, keyword);
	}
	else{
		list=examDao.select();
	}
%>
<!-- 출력 -->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Exam List</title>
</head>
<body>
	<h1>시험 목록</h1>
	<form action="test06_1.jsp">
		<fieldset 	style="width :300">
			<legend>검색화면</legend>
				<select name="column">
					<option value="student">학생명</option>
					<option value="subject">과목명</option>
					<option value="score">유형</option>
				</select>
				<input type="search" name="keyword">
				<input type="submit" value="검색">
		</fieldset>
	</form>
	<!-- 테이블 구성 -->
	<table border="1" width="700">
		<thead>
			<tr>
				<th>시험 아이디</th>
				<th>학생명</th>
				<th>과목명</th>
				<th>시험 유형</th>
				<th>시험 성적</th>
				<th>메뉴</th>
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
				<td>
					<a href = "test09.jsp?examId=<%=examDto.getExamId()%>">
							상세보기</a>
				</td>
		</tr>
			<%} %>
		</tbody>
	</table>
</body>
</html>