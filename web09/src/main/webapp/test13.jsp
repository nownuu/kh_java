<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!-- 파일 업로드 페이지 -->
<h2>get방식 업로드 테스트</h2>
<form action="test14.jsp" method="get">
	<input type="file" name="attach">
	<input type="submit" value="업로드">
</form>

<h2>Post방식 업로드 테스트(1) - 기존 방식</h2>
<form action="test14.jsp" method="post">
	<input type="file" name="attach">
	<input type="submit" value="업로드">
</form>

<h2>Post방식 업로드 테스트(2) - 멀티 파트 방식</h2>
<form action="test14.jsp" method="post" enctype="mutilpart/form-data">
	<input type="file" name="attach" accept=".jpg, .png, .png">
	<input type="submit" value="업로드">
</form>