package blog;

import java.io.IOException;
import java.util.Scanner;

public class nblog_3basic {
	public static void main(String[] args) throws IOException {
		int a = System.in.read(); // 예외처리
		System.out.println("a = "+ a);
		
		// 입력
		Scanner sc = new Scanner(System.in);
		
		// 도구 사용
		int b = sc.nextInt();
		System.out.println("b = "+b);
		
		String c = sc.nextLine();
		System.out.println("c = " +c);
		
		// 종료
		sc.close();
	}
}
