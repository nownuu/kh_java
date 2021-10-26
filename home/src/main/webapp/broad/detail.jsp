<%@page import="home.beans.BoardDto"%>
<%@page import="home.beans.BoardDao"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- 입력 : 게시글번호(boardNo) --%>
<%
	int boardNo = Integer.parseInt(request.getParameter("boardNo"));
%>

<%-- 처리 --%>
<%
	String memberId = (String)session.getAttribute("ses"); 

	BoardDao boardDao = new BoardDao();
	boardDao.readUp(boardNo, memberId);//조회수 증가(남에 글일때만)
	BoardDto boardDto = boardDao.get(boardNo);//단일조회
	
	//본인 글인지 아닌지를 판정하는 변수
	//boolean owner = 세션의ses 값과 게시글 작성자가 같은가?;
	
	boolean owner = boardDto.getBoardWriter().equals(memberId);
%>

<%-- 출력 --%>
<jsp:include page="/template/header.jsp"></jsp:include>

<h2><%=boardDto.getBoardNo()%>번 게시글</h2>

<table border="1" width="80%">
	<tbody>
		<tr>
			<td>
				<h3><%=boardDto.getBoardTitle()%></h3>
			</td>
		</tr>
		<tr>
			<td>
				등록일 : <%=boardDto.getBoardTime()%>
				|
				작성자 : <%=boardDto.getBoardWriter()%>
				|
				조회수 : <%=boardDto.getBoardRead()%>
			</td>
		</tr>
		<!-- 답답해 보이지 않도록 기본높이를 부여 -->
		<!-- 
			pre 태그를 사용하여 내용을 있는 그대로 표시되도록 설정
			(주의) 태그 사이에 쓸데없는 엔터, 띄어쓰기 등이 들어가지 않도록 해야 한다.(모두 표시된다) 
		-->
		<tr height="250" valign="top">
			<td>
				<pre><%=boardDto.getBoardContent()%></pre>
			</td>
		</tr>
		<tr>
			<td align="right">
				<a href="write.jsp">글쓰기</a>
				<a href="list.jsp">목록보기</a>
				
				<%if(owner){ %>
				<a href="edit.jsp?boardNo=<%=boardDto.getBoardNo()%>">수정하기</a>
<%-- 				<a href="delete.kh?boardNo=<%=boardNo%>">삭제하기</a> --%>
				<a href="delete.kh?boardNo=<%=boardDto.getBoardNo()%>">삭제하기</a>
				<%} %>
			</td>
		</tr>
	</tbody>
</table>

<jsp:include page="/template/footer.jsp"></jsp:include>