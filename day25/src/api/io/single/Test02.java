package api.io.single;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;


public class Test02 {
	public static void main(String[] args) throws Exception {
		//Single Byte 입력
		// 준비물 : FileInputStream
		File target = new File("sample","single.txt");
		FileInputStream in = new FileInputStream(target);
		
		//구조 : [프로그램] <- in <- target <- [single.txt]
		
		
		// 1. 파일에 들어있는 byte수 만큼 읽어오도록 구현
		for(long i = 0 ; i < target.length(); i++) {
			int data = in.read();
			System.out.println("data = "+data);
			
			Thread.sleep(500L);
		}
		
		//통로 정리
		in.close();
	}
}
