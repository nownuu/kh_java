<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<jsp:include page="/template/header.jsp"></jsp:include>
<div class="container-400 cotainer-center">
	<div class="row center">
		<h2>confirmation PassWord</h2>
	</div>
	<div class="row">
		<label>password</label>
		<input type="password" name="memberPw" required>
	</div>
	<div class="row">
		<input type="submit" value="회원 탈퇴">
	</div>
	<%if(request.getParameter("error") != null){ %>
	<h4>입력하신 정보가 일치하지 않습니다</h4>
<%} %>
</div>


<form action="quit.kh" method="get">
	
	<table>
		<tbody>
			<tr>
				<th>Password</th>
				<td>
					
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



<jsp:include page="/template/footer.jsp"></jsp:include>