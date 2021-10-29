<%@page import="java.io.File"%>
<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!-- ���� ���ε� ó�� ������ -->
<%
	request.setCharacterEncoding("UTF-8");
	String attach = request.getParameter("attach");
%>

<h3>attach = <%=attach %></h3>

<%
	//Multipart ��û ����� ����� ���� �ڵ� - > semi
	// 1. cos.jar ���̺귯���� �̿��Ͽ� ���� ���ε� �� ������ ����
	//		- ���� : ���ϰ� �ڵ尡 ���� �����ϴ�.
	// 	- ���� : ������ ���� �̸����� 1���� ���� �� �� �ִ�.
	// 2. apache-commons-fileupload ���̺귯���� �̿��Ͽ� ���� ���ε� �� ������ ���� -> fianl
	// 	- ���� : ���� ���� ������ �����ϴ�.
	// 	- ���� : �ڵ尡 ��������� �����ϴ�.
	
	// cos.jar������ MultipartRequest��� Ŭ������ �����ϸ� �̸����� multipart ��û�� ó��
	// multipart/form-data ��Ŀ����� 99.99% Ȯ���� ������ ���۵ȴ�.
	// = ���� ������ ó��(����)�� ���õ� ������ �����ؾ� ��û�� ���� �� �� �ִ�.
	// = (1) �ؼ��� ��û ��ü
	// = (2) ����� ��ġ
	// = (3) ����� ���ε� ���� ũ��
	// = (4) �ؼ��� ���ڵ� ���
	// = (5) [����] �۸���å ��ü
	
	String savePath="D:/upload";
	int maxSize = 1 * 1024 * 1024; //1MB
	String encoding = "UTF-8";
	DefaultFileRenamePolicy policy = new DefaultFileRenamePolicy();
	
	MultipartRequest mRequest = 
				new MultipartRequest(request, savePath ,maxSize, encoding);
	
	// �����ͺ��̽��� ������ ���� ����
	String uploadName = mRequest.getOriginalFileName("attach");
	String saveName = mRequest.getFilesystemName("attach");
	String contentType = mRequest.getContentType("attach");
	
	File target = mRequest.getFile("attach");
	long fileSize = target == null ? 0L : target.length();
%>

<h3>uploadName = <%=uploadName %></h3>
<h3>saveName = <%=saveName %></h3>
