

<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<jsp:include page="/template/header.jsp"></jsp:include>
<h2>글 작성</h2>
<form action = "write.kh" method = "Post">
	<table>
	<tbody>
		<tr>
			<td>게시물 제목</td>
			<td><input type="text" name="boardTitle"></td>
		</tr>
		<tr>
			<td>게시글 내용</td>
			<td><textarea rows="30" cols="50" name="boardContent"></textarea></td>
		</tr>
		</tbody>
	</table>
	<input type="submit" value="등록">
</form>
<jsp:include page="/template/footer.jsp"></jsp:include>