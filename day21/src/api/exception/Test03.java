package api.exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		// Test02의 문제점
		// 1. 발생하는 예왹 정말 두 종류 뿐인지 알 수가 없고
		// 2. 두 종류라고 해서 처리블록을 두 개를 만드는게 맞는건지 알 수 없다.
		// - > 예외를 통합하여
		
		try {
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
		//InputMismatchException 발생 시 실행할 코드 작성
		//catch(RuntimeException e){ 
		//catch(ThrowException e){ //에러까지 처리하고 싶은 경우
		catch(Exception e){ //예외만 처리하고 싶은 경우
			System.err.println("다시 입력하십시오");
		}
	}
}
