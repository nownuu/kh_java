

<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<jsp:include page="/template/header.jsp"></jsp:include>
<h2>�� �ۼ�</h2>
<form action = "write.kh" method = "Post">
	<table>
	<tbody>
		<tr>
			<td>�Խù� ����</td>
			<td><input type="text" name="boardTitle"></td>
		</tr>
		<tr>
			<td>�Խñ� ����</td>
			<td><textarea rows="30" cols="50" name="boardContent"></textarea></td>
		</tr>
		</tbody>
	</table>
	<input type="submit" value="���">
</form>
<jsp:include page="/template/footer.jsp"></jsp:include>