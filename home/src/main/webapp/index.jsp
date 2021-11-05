<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- 정적 include :컴파일 이전에 합쳐지므로 불러올 파일의 내용을 사용 할 수 있다..-->
<%-- <%@	include file="/template/header.jsp" %> --%>

<!-- 동적 include : 컴파일 이후에 합쳐지므로 불러올 파일의 내용을 사용 할 수 없다.-->
<jsp:include page = "/template/header.jsp"></jsp:include>

	<h2>내가 만든 첫번째 홈페이지</h2>
	<img src="/home/resource/image/kh_main.jpg" width="700">
	
<%@ include file="/template/footer.jsp" %>
