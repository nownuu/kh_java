package api.io.file;

import java.io.File;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("파일 경로를 입력하십시오");
		File file = new File(sc.next());
		
		if(file.exists()) { // 파일이 존재하는 경우
			if(file.isFile()) {
				System.out.println("==파일 정보==");
				System.out.println("[이름] "+ file.getName());
				System.out.println("[절대 경로]" +file.getAbsolutePath());
				System.out.println("[크기] "+file.length()+"byte");
				Date d = new Date(file.lastModified());
				Format f = new SimpleDateFormat("y년 MM월 dd일 E요일 HH:mm:ss");
				System.out.println("[최종 수정 시간]" +f.format(d));
			}
			
			else {
				System.out.println("==디렉터리 정보==");
				System.out.println("[이름] "+file.getName());
				
				File[] files = file.listFiles();
				for(File f : files) {
					if(f.isFile()) {
						System.out.println("--> [파일] "+f.getName() + " ("+f.length()+" bytes)");
					}
					else if(f.isDirectory()) {
						System.out.println("--> [폴더] "+f.getName());
					}
				}
			}
		}
		else { //존재하지 않을 경우
			System.out.println("해당 경로는 존재하지 않습니다.");
		}
	}
}
