package api.exception;

import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		// Q 프로그램에서 예외가 발생하는 상황과 예외의 이름을 조사해보세요.
		
		Scanner sc = new Scanner(System.in);
		System.out.println("쿠폰 개수 입력");
		int a = sc.nextInt();
		System.out.println("인원 수 입력");
		int b = sc.nextInt();
		sc.close();
		
		int c = a/b;
		System.out.println("한  사람당 줄 수 있는 쿠폰 개수 = "+c);
		int d = a%b ; 
		System.out.println("남는 쿠폰 개수 = "+d);
				
		
	}
}
