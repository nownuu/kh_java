<%@page import="web09.beans.ProductDto"%>
<%@page import="java.util.List"%>
<%@page import="web09.beans.ProductDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	ProductDao productDao = new ProductDao();
	List<ProductDto> list = productDao.select();
%>
<% for(ProductDto productDto : list){%>
	<fieldset><legend>상품 정보 리스트</legend>
	<h5><%="상품 번호 : "+productDto.getNo()%></h5>
	<h5><%="상품 명 : "+productDto.getName() %></h5>
	<h5><%="상품 유형 : "+productDto.getType() %></h5>
	<h5><%="상품 가격 : "+productDto.getPrice() %></h5>
	<h5><%="제조 일자 : "+productDto.getMade() %></h5>
	<h5><%="유통 기한 : "+productDto.getExpire() %></h5>
	</fieldset>
<%}%>