<%@page import="web09.beans.ProductDto"%>
<%@page import="java.util.List"%>
<%@page import="web09.beans.ProductDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String column = request.getParameter("column");
	String keyword = request.getParameter("keyword");
	
	boolean search = column != null && keyword != null;
	
	ProductDao productDao = new ProductDao();
	List<ProductDto> list;
	
	if(search){
		list=productDao.select(column, keyword);
	}
	else{
		list=productDao.select();
	}
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Product List</title>
</head>
<body>
	<h1>상품 정보 목록</h1>
<form action="test07.jsp">
	<fieldset>
		<legend>상품 검색</legend>
			<select name="column">
				<option value="name">이름</option>
				<option value="type">유형</option>
			</select>
			<input type="search"  name="keyword" >
			<input type="submit" value="검색">
	</fieldset>
</form>

	<table border="1">
		<thead align="center">
			<tr>
				<th>상품번호</th>
				<th>상품명</th>
				<th>상품 유형</th>
				<th>상품 가격</th>
				<th>제조 일자</th>
				<th>유통 기한</th>
				<th>메뉴</th>
			</tr>
		</thead>
		<tbody>
		<%for(ProductDto productDto : list){  %>
			<tr>
				<td align="center"><%=productDto.getNo() %></td>
				<td><%=productDto.getName() %></td>
				<td><%=productDto.getType() %>
				<td><%=productDto.getPrice() %></td>
				<td><%=productDto.getMade().substring(0,10) %></td>
				<td><%=productDto.getExpire().substring(0,10)  %></td>
				<td>
					<a href="test10.jsp?no=<%=productDto.getName() %>">
							상세보기</a>
				</td>
			</tr>
		<%}  %>
		</tbody>
	</table>
</body>
</html>