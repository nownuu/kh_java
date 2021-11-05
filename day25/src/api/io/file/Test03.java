package api.io.file;

import java.io.File;

public class Test03 {
	public static void main(String[] args) {
		File dir = new File("sample");
		System.out.println(dir.exists());
		//정보분석
		//1. 디렉터리는 크기가 없다.
		System.out.println(dir.length());
		
		//2.이름
		System.out.println(dir.getName());
		
		//3. 경로
		System.out.println(dir.getPath());
		System.out.println(dir.getAbsolutePath());
		
		//4.내부의 파일 목록
		// = list() : 이름만 반환
		// = listFiles() : 파일 객체를 반환
		
		String[] names = dir.list();
		for(String name : names) {
			System.out.println(name);
		}
		File[] files = dir.listFiles();
		for(File f : files) {
			System.out.println(f);
			System.out.println("file? " + f.isFile());//f가 파일인가?
			System.out.println("directory? "+f.isDirectory());//f가 디렉터리인가?
		}
	}
}
