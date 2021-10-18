<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String ses = (String)session.getAttribute("ses");
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Homepage</title>
</head>
<body>
	<!-- 1단 : 메인 로고 등 대표 정보
			2단 : 각종 기능으로 이동할 수 있는 메뉴
			3단 : 홈페이지에 표시될 내용들
			4단 : 기업 정보, 제휴 컨텐츠 등 -->
			
		<table border="1" width="1000" align="center">
			<tbody align="center">
				<tr>
					<td>
						<br>
						<img src="/home/resource/image/kh_logo.jpg" width="250" height="50">
						<h3>과정평가형 정보처리산업기사 취득과정</h3>
					</td>
				</tr>
				<tr>
					<td>
					<%
						String root = request.getContextPath();
					%>
						<a href="<%=root %>/index.jsp">홈으로</a>
						<a href="<%=root %>/member/join.jsp">회원가입</a>
						<a href="<%=root %>/member/login.jsp">로그인</a>
						<a href="">로그아웃</a>
						<a href="">내정보</a>
						<a href="">게시판</a>
					</td>
				</tr>
				<tr>
					<td>