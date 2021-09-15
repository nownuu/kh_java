package api.io.object;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Set;
import java.util.TreeSet;

public class Test04 {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		File target = new File("sample", "lotto2.kh");
		if(!target.exists()) {
			System.out.println("파일이 존재하지 않습니다.");
			System.exit(-1);
		}
		
		FileInputStream in = new FileInputStream(target);
		BufferedInputStream buffer = new BufferedInputStream(in);
		ObjectInputStream oData = new ObjectInputStream(buffer);
		
		// 경고는 set의 내용물까지는 확신할 수 없기 때문에 발생
		// 해결책 없음
		
		@SuppressWarnings("unchecked")
		Set<Integer> lotto = (Set<Integer>) oData.readObject();
		
		oData.close();
		
		for(int number : lotto) {
			System.out.println(number);
		}
	}
}
