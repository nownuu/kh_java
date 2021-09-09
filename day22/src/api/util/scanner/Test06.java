package api.util.scanner;

import java.util.Scanner;

public class Test06 {
	public static void main(String[] args) {
		//키보드 입력 시 주의 상항
		// next()종류와 nextLine()을 섞어서 사용하면 문제가 발생한다.
		// next()는 공백(띄어쓰기, 개행)을 인식하는 명령
		// nestLine()은 개행문자만 인식하는 명령(개행문자를 읽고 나서 제거함)
		// 만약 next()계열 명령 이후에 nextline()을 사용해야하 ㄹ경우 nextLine()을 한번 더 사용해서 개행
		Scanner sc = new Scanner(System.in);
		
		System.out.println("입력");
		
		String a = sc.next();
		sc.nextLine(); // 남아있는 개행문자를 정리하기 위하여 읽는 명령을 추가로 삽입
		String b = sc.nextLine();
		
		sc.close();
		System.out.println("a = "+a);
		System.out.println("b = "+b);
	}
}
