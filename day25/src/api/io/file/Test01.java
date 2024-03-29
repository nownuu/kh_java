package api.io.file;

import java.io.File;

public class Test01 {
	public static void main(String[] args) {
		//파일이란?
		// = 글자를 보관하기 위한 저장곤간
		// = 파일의 크기 == 파일 안에 들어있는 글자의 크기
		// 1. 의미있는 글자를 보관하기 위한 파일 (txt 파일)
		// 2. 특정 프로그램에서만 이해할 수 있는 파일 (binary 파일)
		
		// 파일 클래스에서는 물리 저장소에 존재하는 파일을 제어할 수 있다.
		// = 해당하는 파일의 객체를 생성해야 제어가 가능하며, 생성을 위해서는 반드시 정보가 필요하다.
		// = 필요한 정보 : 파일이 위치한 경로와 파일의 이름
		// = 자바에서는 전체경로를 적지 않으면 프로젝트부터 계산한다.
		
		File a = new File("sample", "test.txt"); // sample 폴더의 test.txt 관리 객체 생성
		File b = new File("sample/test.txt");//sample/test.txt 관리 객체 생성
		File c = new File("sample\"\test.txt"); // sample\test.txt 관리 객체 생성
		
		System.out.println(a.exists());
		System.out.println(b.exists());
		System.out.println(c.exists());
	}
}
