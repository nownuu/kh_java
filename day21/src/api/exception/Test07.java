package api.exception;

import java.util.Scanner;

public class Test07 {

	public static void main(String[] args) {
		// Test06의 문제점
		// = Scanner와 같은 통로 형태의 도구는 반드시 close() 작업이 필요로 하다.
		// = try~catch는 Plan A(try), Plan B(catch)등 확실하게 실행을 장담할 수 있는 영역이 없다.
		
		int page ;
		Scanner sc = new Scanner(System.in);
		
		try {
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
		finally {
			sc.close();
			System.out.println("도구 정리 완료");
		}
		System.out.println("page = "+page);
	}
}
