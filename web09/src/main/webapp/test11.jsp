<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- 세션(session)의 특징
	= 세션은 서버에서 관리하는 사용자를 위한 저장소이다.
	= 세션은 서버에 총 1개 존재한다.
--%>

<%
	session.invalidate();
%>

<h1>세션 ID : <%=session.getId() %></h1>
<h1>신규 세션? <%=session.isNew() %></h1>