<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<jsp:include page="/template/header.jsp"></jsp:include>
<div class="container-400 container-center">
	<div class="row center">
		<h2>비밀번호 변경</h2>
	</div>
	<div class="row">
		<label>password</label>
		<input class="form-input" type="password" name="memberPw" required>
	</div>
	<div class="row">
		<label>Change password</label>
		<input class="form-input" type="password" name="changePw" required>
	</div>
	<div class="row">
	<input class="form-btn" type="submit" value="변경">
	</div>
	<%if(request.getParameter("error") != null){ %>
	<h4>입력하신 정보가 일치하지 않습니다</h4>
<%} %>
</div>
<h2>비밀번호 변경</h2>

<form action="password.kh" method="post">

</form>



<jsp:include page="/template/footer.jsp"></jsp:include>