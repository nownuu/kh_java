<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<jsp:include page="/template/header.jsp"></jsp:include>
    <div class="container-400 container-center">
    	<div class="row center">
    		<h1>회원 로그인</h1>
    	</div>
    	<div class="row">
    		<label>아이디</label>
    		<input class="form-input" type="text" name="memberId" required>
    	</div>
    	<div class="row">
    		<label>비밀번호</label>
    		<input class="form-input" type="password" name="memberPw" required>
    	</div>
    	<div class="row right">
    		<input class="form-btn form-inline" type="submit" value="로그인">
    	</div>
    	<%if(request.getParameter("error") !=null){ %>
			<h5>로그인 정보가 일치하지 않습니다.</h5>
		<%} %>
    </div>
<jsp:include page="/template/footer.jsp"></jsp:include>