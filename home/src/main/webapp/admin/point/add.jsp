<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%

%>
<jsp:include page="/template/header.jsp"></jsp:include>
<h2>����Ʈ ��ǰ ���</h2>

<form action="add.kh" method="post">
	��ǰ �̸� :
	<input type="text" name="coinName" required>
	<br><br>
	��ǰ �ݾ� : 
	<input type="text" name="coinAmount" required>
	<br><br>
	<input type="submit" value="���">
</form>
<jsp:include page="/template/footer.jsp"></jsp:include>