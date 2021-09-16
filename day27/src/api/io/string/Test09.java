package api.io.string;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Test09 {
	public static void main(String[] args) throws IOException {
		// 문자열 입력
		// = 글자 수를 정해서 입력을 받는 방법, 또는 줄 단위로 입력 받는 것이 원칙
		
		// = 도구 : 파일 객체, FileReader
		
		File target = new File("sample","string.kh");
		FileReader in = new FileReader(target);
		BufferedReader buffer = new BufferedReader(in);
		
		// BufferedReader 에는 read() 말고 readLine()이라는 명령이 있다.
		// 주의 EOF == null 이다.
		while(true) {
		String line = buffer.readLine();
		if(line == null) break;
		System.out.println("line = "+line);
		}
		
		buffer.close();
	}
}
