<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

 <jsp:include page="/template/header.jsp"></jsp:include>
 
 <h2>Change PassWord</h2>
 <form action="password.kh" method="post">
 	<table>
 		<tbody>
 			<tr>
 				<th>PassWord</th>
 				<td>
 					<input type="password" name="memberPw" required>
 				</td>
 			</tr>
 			<tr>
 				<th>Change PassWord</th>
 				<td>
					<input type="password" name="changePw" required>
				</td>
 			</tr>
 		</tbody>
 		<tfoot>
 			<tr>
 				<td colspan="2" align="center">
 					<input type="submit" value="변경">
 				</td>
 			</tr>
 		</tfoot>
 	</table>
 </form>
 <%
 	if(request.getParameter("error") !=null){
 %>
	<h5><font color="red">입력하신 정보가 일치하지 않습니다.</font></h5>
<%} %>
 <jsp:include page="/template/footer.jsp"></jsp:include>