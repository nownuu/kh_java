package api.io.string;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class Test03 {
	public static void main(String[] args) throws IOException {
		// 문자열은 객체 출력, 멀티바이트 출력, 싱글바이트 출력 모두 가능하다.
		
		// ex. 싱글바이트 출력으로 진행(String클래스와 getByte() 사용)
		String str = "안녕 Java!";
		
		byte[] b = str.getBytes();
//		byte[] b = str.getBytes("UTF-8");
//		byte[] b = str.getBytes("MS949");
//		byte[] b = str.getBytes("EUC-KR");
		
		System.out.println(Arrays.toString(b));
		
		File target = new File("sample", "string.kh");
		FileOutputStream out = new FileOutputStream(target);
		
		out.write(b);
		
		out.close();
	}
}
