<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	String ses = (String)session.getAttribute("ses");
	boolean login = ses != null;
	
	String grade = (String)session.getAttribute("grade");
	boolean admin = grade != null;
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Homepage</title>
</head>
<body>

	<%--
		홈페이지를 4단으로 구성
		= 1단 : 메인로고 등 대표정보
		= 2단 : 각종 기능으로 이동할 수 있는 메뉴
		= 3단 : 홈페이지에 표시될 내용들..
		= 4단 : 기업정보 or 제휴컨텐츠 등... 
	--%>
	<table border="1" width="1000" align="center">
		<tbody align="center">
			<tr>
				<td>
					<br>
					<img src="/home/resource/image/kh_logo.jpg" width="250" height="50">
					<!-- 
					<img src="./resource/image/kh_logo.jpg" width="250" height="50">
					 -->
					<h3>
						과정평가형 정보처리산업기사 취득과정
						(ses = <%=ses%>, login = <%=login%>)
					</h3>
				</td>
			</tr>
			<tr>
				<td>
					<%
						String root = request.getContextPath();
					%>	 
					<%if(login){ %>
					<a href="<%=root%>/index.jsp">홈으로</a>
					<a href="<%=root%>/member/logout.kh">로그아웃</a>
					<a href="<%=root%>/member/mypage.jsp">내정보</a>
					<a href="<%=root%>/point/charge.jsp">[포인트충전]</a>
					<a href="#">게시판</a>
					<%}else{ %>
					<a href="<%=root%>/index.jsp">홈으로</a>
					<a href="<%=root%>/member/join.jsp">회원가입</a>
					<a href="<%=root%>/member/login.jsp">로그인</a>
					<a href="#">게시판</a>
					<%} %>
					
					<%if(admin){%>
					<a href="<%=root%>/admin/home.jsp">[관리메뉴]</a>
					<%} %>
				</td>
			</tr>
			<tr>
				<td>