package api.exception;

import java.util.Scanner;

public class Test05 {
	public static void main(String[] args) {
		
		//원하는 범위에 예외 처리를 수행하여 "이상한 입력"이 발생한 경우 페이지가 1로 처리되도록 구현해보세요.
		
		int page ;
		
		try {
		Scanner sc = new Scanner(System.in);
		System.out.println("이동할 페이지 = ");
		page = sc.nextInt();
		sc.close();
		
		System.out.println("page = "+page);
		}
		
		
		catch( Exception e) {
			page = 1;
		}
	}
}
