<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- 입력 : 답글일 경우에는 boardSuperno라는 값이 전달된다. --%>
<%
	String boardSuperNo = request.getParameter("boardSuperNo");
%>

<%-- 처리 --%>
<%
	boolean answer = boardSuperNo != null;
	String title = answer ? "답글 작성" : "새글 작성";
%>

<%-- 출력 --%>
<jsp:include page="/template/header.jsp"></jsp:include>

<h2><%=title%></h2>

<form action="write.kh" method="post">

<%-- 답글일 경우에는 반드시 "상위글번호(boardSuperno)" 를 처리페이지로 전송해야 한다 --%>
<%if(answer){ %>
<input type="hidden" name="boardSuperno" value="<%=boardSuperNo%>">
<%} %>

<table border="0">
	<tbody>
		<tr>
			<th>제목</th>
			<td><input type="text" name="boardTitle" required></td>
		</tr>
		<tr>
			<th>내용</th>
			<td>
				<textarea name="boardContent" required rows="10" cols="60"></textarea>
			</td>
		</tr>
		<!-- 첨부파일 -->
		<tr>
			<th>첨부</th>
			<td>
				<input type="file" name="attach">
			</td>
		</tr>
	</tbody>
	<tfoot>
		<tr>
			<td colspan="2" align="right">
				<input type="submit" value="등록">
			</td>
		</tr>
	</tfoot>
</table>
	
</form>

<jsp:include page="/template/footer.jsp"></jsp:include>