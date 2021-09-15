package api.io.single;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Test03_5 {
	public static void main(String[] args) throws IOException{
		
		//파일 생성
		File origin = new File("sample", "origin.txt");
		origin.createNewFile();
		
		//파일 생성
		File copy = new File("sample", "copy.txt");
		copy.createNewFile();
		
		// 복사(입출력)
		OutputStream out =  new FileOutputStream(copy);
		FileInputStream in = new FileInputStream(origin);
		
		FileManager.copyFile(origin, copy);
		
	}
}
