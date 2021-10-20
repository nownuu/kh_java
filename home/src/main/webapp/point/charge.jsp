<%@page import="java.util.List"%>
<%@page import="home.beans.CoinDto"%>
<%@page import="home.beans.CoinDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<jsp:include page="/template/header.jsp"></jsp:include>

<h2>포인트 충전</h2>
<form action="/member/charge.kh" method="get">
<table>
		<thead>
			<tr>
				<th><h3>원하시는 상품을 선택하세요.</h3></th>
			</tr>
		</thead>
		<tbody>
				  <tr>
			<td><input type="checkbox" name="coinAmount" value="300" /> 300 point</td>
			<td><input type="checkbox" name="coinAmount" value="5000" /> 5000 point</td>
			<td><input type="checkbox" name="coinAmount" value="10000" /> 10000 point</td>
			<td><input type="checkbox" name="coinAmount" value="50000" /> 50000 point</td>
			<td><input type="checkbox" name="coinAmount" value="100000" /> 100000 point</td>
  				</tr>
  		</tbody>
</table>
</form>
<jsp:include page="/template/footer.jsp"></jsp:include>