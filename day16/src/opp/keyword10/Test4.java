package opp.keyword10;

import java.util.Random;

public class Test4 {
		// 랜덤으로 가위바위보 중 하나를 출력
		// 랜덤으로 정수를 추첨할 수 있다.
		// 문자열은 어떻게?
		
		// 약속 : 가위, 바위, 보
	
		// 객체 없이 편하게 접근할 수 있도록 정적 변수 처리
		static final int 가위 = 1;
		static final int 바위 = 2;
		static final int 보 = 3;
		// 상수 - 변하지 않는 변수 - 아무데서나 객체 없이 편리하게 클래스 명으로 접근 가능
		
		public static void main(String[] args) {
		Random r = new Random();
		int com = r.nextInt(RSP.RANGE) + RSP.START;
		
		// System.out.println("com = "+com);
		
		switch(com) {
		case 가위:
			System.out.println("가위");
		case 바위:
			System.out.println("바위");
		case 보:
			System.out.println("보");
			break;
		}
	}
}
