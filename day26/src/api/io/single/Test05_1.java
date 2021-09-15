package api.io.single;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

public class Test05_1 {
	public static void main(String[] args) throws IOException{
		//버퍼를 사용하여 한 번에 여러 개의 바이트 읽기
		// = 파일마다 크기 수가 다르다
		// = buffer를 만들때 일정 크기를 지정해서 만들어야한다.
		// = 적당한 크기가 얼마인지에 대해서 이해할 필요가 있다.
		
		File target = new File("sample", "single.txt");
		InputStream in = new FileInputStream(target);
		
		byte[] buffer = new byte[5];
		
		int n;
		
		n = in.read(buffer);
		System.out.println("n = "+ n);
		System.out.println("buffer = "+Arrays.toString(buffer));
		
		n = in.read(buffer);
		System.out.println("n = "+ n);
		System.out.println("buffer = "+Arrays.toString(buffer));
		n = in.read(buffer);
		System.out.println("n = "+ n);
		System.out.println("buffer = "+Arrays.toString(buffer));
		n = in.read(buffer);
		System.out.println("n = "+ n);
		System.out.println("buffer = "+Arrays.toString(buffer));
		
		in.close();
		
		
		//int data = in.read();
		// System.out.println("data = "+data);
	}
}
