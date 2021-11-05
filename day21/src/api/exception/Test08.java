package api.exception;

import java.util.Scanner;

public class Test08 {

	public static void main(String[] args) {
		// JDK 1.8부터는 톨로를 사용하는 try - catch 구문은 자동 close()를 지원한다.
		// try - with구문
		// 통로 형태의 객체를 사용할 때만 필요한 형태
		// try(사용할 통로 객체 생성){감시코드} catch(예외 객체 생성)
		
		int page ;
		
		try(
		Scanner sc = new Scanner(System.in);
		){
		System.out.println("이동할 페이지 = ");
	
		page = sc.nextInt();
		if(page <= 0 ) {
			// throw 뒤에 예외객체를 붙여서 catch 블록으로 강제 이동시킬 수 있다.
			// catch 블록에 들어갈 수 있는 형태의 예오 객체를 만들어야한다.
			Exception ex = new Exception();
			throw ex;
		}
		}
		catch( Exception e) {
			page = 1;
		}
		System.out.println("page = "+page);
	}
}
