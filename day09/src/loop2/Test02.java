package loop2;

import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		
		// 0 을 입력할 때까지 계속해서 숫자를 입력받는 프로그램 구현
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
		System.out.println("숫자 입력");
		int number = sc.nextInt();
		
		if(number == 0) {
			break;
		}
	}
		sc.close();
	}
}
