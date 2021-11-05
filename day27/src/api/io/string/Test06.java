package api.io.string;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Test06 {
	public static void main(String[] args) throws IOException {
		
		Scanner sc = new Scanner(System.in);
		
		File target = new File("sample","user.kh");
		FileWriter out = new FileWriter(target);
		BufferedWriter buffer = new BufferedWriter(out);
		PrintWriter printer = new PrintWriter(buffer);
		
		
		String str ;
		System.out.println("문자를 입력하십시오");
		while(true) {
			str = sc.nextLine();
			
			if(str.equals("종료"))break; 
				printer.println(str);
				printer.flush();
		}
			sc.close();
			printer.close();
			
			System.out.println("저장이 완료되었습니다.");
		}
	}

