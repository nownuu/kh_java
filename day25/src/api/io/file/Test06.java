package api.io.file;

import java.io.File;

public class Test06 {
	public static void main(String[] args) {
		// 파일 또는 디렉터리의 생성 및 삭제
		//파일과 디렉터리는 생성 명령이 다르다.
		//=이름 만으로는 파일인지 디렉터리인지 구분 할 수 없기 때문에 명령 자체가 다르다.
		
		//1. 디렉터리 생성
		
		File a = new File("sample /a/b/c/d"); //이클립스 파일에 moon파일 생성 완료
		//boolean result = a.mkdir(); // 중간 경로가 없는 경우에는 생성하지 않는 명령
		boolean result = a.mkdirs();
		System.out.println("result = "+result);
		
		// 응용
		String home = System.getProperty("user.home"); // 사용자 정보
		System.out.println("home = "+home);
		File kh = new File(home, "khacademy"); // user 파일에 khacademy 폴더 생성
		kh.mkdirs(); 
		System.out.println("폴더생성 완료");
		
		
	}
}
