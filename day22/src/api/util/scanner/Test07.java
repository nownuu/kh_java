package api.util.scanner;

import java.io.File;
import java.util.Scanner;

public class Test07 {
public static void main(String[] args) {
	File file = new File("readme.md");
	
	try {
		Scanner sc = new Scanner(file);
		
		while(sc.hasNextLine()) {
			System.out.println(sc.nextLine());
		}
	}
	catch(Exception e) {
		System.out.println("파일이 없습니다.");
	}
}
}
