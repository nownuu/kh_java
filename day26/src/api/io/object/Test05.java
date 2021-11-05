package api.io.object;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Test05 {
	public static void main(String[] args) throws IOException {
		// 내가 만든 클래스의 객체 출력
		
		File target = new File("sample","student.kh");
		FileOutputStream out = new FileOutputStream(target);
		BufferedOutputStream buffer = new BufferedOutputStream(out);
		ObjectOutputStream oData = new ObjectOutputStream(buffer);
		
		Student stu = new Student("피카츄", "게임", 80);
		
		oData.writeObject(stu);
		
		oData.close();
	}
}
