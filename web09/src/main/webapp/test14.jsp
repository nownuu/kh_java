<%@page import="java.io.File"%>
<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!-- 파일 업로드 처리 페이지 -->
<%
	request.setCharacterEncoding("UTF-8");
	String attach = request.getParameter("attach");
%>

<h3>attach = <%=attach %></h3>

<%
	//Multipart 요청 방식일 경우의 수신 코드 - > semi
	// 1. cos.jar 라이브러리를 이용하여 파일 업로드 및 저장을 수행
	//		- 장점 : 편하고 코드가 비교적 간단하다.
	// 	- 단점 : 파일을 같은 이름으로 1개만 수신 할 수 있다.
	// 2. apache-commons-fileupload 라이브러리를 이용하여 파일 업로드 및 저장을 수행 -> fianl
	// 	- 장점 : 파일 다중 선택이 가능하다.
	// 	- 단점 : 코드가 상대적으로 복잡하다.
	
	// cos.jar에서는 MultipartRequest라는 클래스를 제공하며 이를통해 multipart 요청을 처리
	// multipart/form-data 방식에서는 99.99% 확률로 파일이 전송된다.
	// = 따라서 파일의 처리(저장)와 관련된 값들을 설정해야 요청을 수신 할 수 있다.
	// = (1) 해석할 요청 객체
	// = (2) 저장될 위치
	// = (3) 허용할 업로드 제한 크디
	// = (4) 해석할 인코딩 방식
	// = (5) [선택] 작명정책 객체
	
	String savePath="D:/upload";
	int maxSize = 1 * 1024 * 1024; //1MB
	String encoding = "UTF-8";
	DefaultFileRenamePolicy policy = new DefaultFileRenamePolicy();
	
	MultipartRequest mRequest = 
				new MultipartRequest(request, savePath ,maxSize, encoding);
	
	// 데이터베이스에 저장한 정보 추출
	String uploadName = mRequest.getOriginalFileName("attach");
	String saveName = mRequest.getFilesystemName("attach");
	String contentType = mRequest.getContentType("attach");
	
	File target = mRequest.getFile("attach");
	long fileSize = target == null ? 0L : target.length();
%>

<h3>uploadName = <%=uploadName %></h3>
<h3>saveName = <%=saveName %></h3>
