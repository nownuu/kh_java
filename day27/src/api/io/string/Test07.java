package api.io.string;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Test07 {
	public static void main(String[] args) throws FileNotFoundException {
		// 문자열 입력
		// = 글자 수를 정해서 입력을 받는 방법, 또는 줄 단위로 입력 받는 것이 원칙
		
		// = 도구 : 파일 객체, FileReader
		
		File target = new File("sample","string.kh");
		FileReader out = new FileReader(target);
		BufferedReader buffer = new BufferedReader(out);
	}
}
