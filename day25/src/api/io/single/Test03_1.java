package api.io.single;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class Test03_1 {
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
		
		// 진행상황표시
		// = 원본 파일의 byte 크기
		// = 복사 완료한 byte 크기
		int data = 0;
		long total = origin.length();
		long count = 0L;
		
		while((data = in.read()) != -1) {
            out.write(data);
            
            out.write(data);
            count++;
            
            float percent = count * 100f / total;
            System.out.println("총" +total +"개 중 "+count+"byte 복사 완료");
        }
		
        //종료
        in.close();
        out.close();
	}
}
