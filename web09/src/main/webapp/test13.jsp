<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!-- ���� ���ε� ������ -->
<h2>get��� ���ε� �׽�Ʈ</h2>
<form action="test14.jsp" method="get">
	<input type="file" name="attach">
	<input type="submit" value="���ε�">
</form>

<h2>Post��� ���ε� �׽�Ʈ(1) - ���� ���</h2>
<form action="test14.jsp" method="post">
	<input type="file" name="attach">
	<input type="submit" value="���ε�">
</form>

<h2>Post��� ���ε� �׽�Ʈ(2) - ��Ƽ ��Ʈ ���</h2>
<form action="test14.jsp" method="post" enctype="mutilpart/form-data">
	<input type="file" name="attach" accept=".jpg, .png, .png">
	<input type="submit" value="���ε�">
</form>