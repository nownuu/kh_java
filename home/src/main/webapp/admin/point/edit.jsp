<%@page import="home.beans.CoinDto"%>
<%@page import="home.beans.CoinDao"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!-- �Է� -->
<%
	int coinNo = Integer.parseInt(request.getParameter("coinNo"));
	
	CoinDao coinDao = new CoinDao();
	CoinDto coinDto = coinDao.get(coinNo);
%>
<jsp:include page="/template/header.jsp"></jsp:include>
<h2>����Ʈ ��ǰ ����</h2>
<form action="edit.kh" method="post">
	��ǰ ��ȣ : 1
	<input type="hidden" name="coinNo" value="<%=coinDto.getCoinNo()%>">
	<br><br>
	��ǰ �̸� : <input type="text" name="coinName" value="<%=coinDto.getCoinName()%>">
	<br><br>
	��ǰ �ݾ� : <input type="text" name="coinAmount" value="<%=coinDto.getCoinAmount()%>">
	<br><br>
	<input type="submit" value="����">
</form>

<jsp:include page="/template/footer.jsp"></jsp:include>