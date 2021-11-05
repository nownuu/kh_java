<%@page import="web09.beans.ExamDto"%>
<%@page import="java.util.List"%>
<%@page import="web09.beans.ExamDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	ExamDao examDao = new ExamDao();
	List<ExamDto> list = examDao.select();
%>
<% for(ExamDto examDto : list){%>
	<h3><%=examDto.getStudent()%></h3>
<%}%>