<%@page import="home.beans.CoinDto"%>
<%@page import="java.util.List"%>
<%@page import="home.beans.CoinDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%-- 입력 : 없음 --%>

<%-- 처리 : 포인트상품 목록 --%>    
<%
	CoinDao coinDao = new CoinDao();
	List<CoinDto> list = coinDao.list();
%>

<%-- 출력 --%>
<jsp:include page="/template/header.jsp"></jsp:include>

<h2>포인트 충전</h2>

<h3>원하시는 상품을 선택하세요</h3>

<table>
	<tbody>
		<%for(CoinDto coinDto : list){ %>
		<tr>
			<td><input type="radio" name="coinNo" value="<%=coinDto.getCoinNo() %>"></td>
			<td><%=coinDto.getCoinName()%></td>
			<td>(<%=coinDto.getCoinAmount()%> point)</td>
		</tr>
		<%} %>
	</tbody>
	<tfoot>
		<tr align="right">
			<td colspan="3">
				충전버튼
			</td>
		</tr>
	</tfoot>
</table>
<jsp:include page="/template/footer.jsp"></jsp:include>
