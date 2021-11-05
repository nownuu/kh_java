<%@page import="web09.beans.ProductDto"%>
<%@page import="web09.beans.ProductDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	int no = Integer.parseInt(request.getParameter("no"));

	ProductDao productDao = new ProductDao();
	ProductDto productDto = productDao.select(no);
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Product List</title>
</head>
<body>
	<h1>상품 정보 상세</h1>
	
	<ul>
		<li>상품 번호 : <%=productDto.getNo() %></li>
		<li>상품명 : <%=productDto.getName() %></li>
		<li>상품 유형 : <%=productDto.getType() %></li>
		<li>상품 가격 : <%=productDto.getPrice() %></li>
		<li>제조 일자: <%=productDto.getMade() %></li>
		<li>유통 기한 : <%=productDto.getExpire() %></li>
	</ul>
		<h5><a href ="test07.jsp">목록보기</a></h5>
</body>
</html>