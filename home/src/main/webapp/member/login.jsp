<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="/template/header.jsp"></jsp:include>
    
    <h1>LOGIN</h1>
    <form action="login.kh" method="post">
    <table border ="0">
    <tbody>
		  <tr>
    			<th>ID</th>
   	 			<td><input type="text" name="memberId" required></td>
 		</tr>
  		<tr>
   			 <th>Pass Word</th>
    		 <td><input type="text" name="memberPw" required></td>
  		</tr>
  </tbody>
  <tfoot>
  		<tr>
				<td colspan="2" align="right">
					<input type="submit" value="로그인">
				</td>
		</tr>
  </tfoot>
</table>
</form>  
<%if(request.getParameter("error") !=null){ %>
	<h5>
		<font color="red">로그인 정보가 일치하지 않습니다.</font> 
	</h5>
<%} %>
<jsp:include page="/template/footer.jsp"></jsp:include>