<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<jsp:include page="/template/header.jsp"></jsp:include>

<h2>confirmation PassWord</h2>

<form action="quit.kh" method="get">
	
	<table>
		<tbody>
			<tr>
				<th>Password</th>
				<td>
					<input type="password" name="memberPw" required>
				</td>
			</tr>
		</tbody>
		<tfoot>
			<tr>
				<td colspan="2" align="center">
					<input type="submit" value="회원 탈퇴">
				</td>
			</tr>
		</tfoot>
	</table>
	
</form>

<%if(request.getParameter("error") != null){ %>
	<h4><font color="red">입력하신 정보가 일치하지 않습니다</font></h4>
<%} %>

<jsp:include page="/template/footer.jsp"></jsp:include>