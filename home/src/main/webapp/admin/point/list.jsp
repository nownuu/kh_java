<%@page import="java.text.DecimalFormat"%>
<%@page import="java.text.Format"%>
<%@page import="home.beans.CoinDto"%>
<%@page import="java.util.List"%>
<%@page import="home.beans.CoinDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- 입력 : 없음 --%>    

<%-- 처리 : List<CoinDto> --%>
<%
	CoinDao coinDao = new CoinDao();
	List<CoinDto> list = coinDao.list();
%>

<%-- 출력 --%>
<jsp:include page="/template/header.jsp"></jsp:include>

<h2>포인트 상품 관리</h2>

<table border="1" width="500">
	<thead>
		<tr>
			<th>상품번호</th>
			<th>상품이름</th>
			<th>상품금액</th>
			<th>관리메뉴</th>
		</tr>
	</thead>
	<tbody align="center">
		<%Format f = new DecimalFormat("#,##0"); %>
		<%for(CoinDto coinDto : list){ %>
		<tr>
			<td><%=coinDto.getCoinNo()%></td>
			<td><%=coinDto.getCoinName()%></td>
			<td align="right"><%=f.format(coinDto.getCoinAmount())%></td>
			<td>
				수정
				삭제
			</td>
		</tr>
		<%} %>
	</tbody>
</table>

<jsp:include page="/template/footer.jsp"></jsp:include>