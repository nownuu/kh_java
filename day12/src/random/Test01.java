package random;

import java.util.Random;

public class Test01 {
	public static void main(String[] args) {
		//랜덤
		// 무작위 데이터, 다음에 뭐가 나올지 예측할 수 없는 데이터
		// 로또, 주사위
		
		// 추첨 방법
		// Math.random() 명령을 사용하는 방법
		// 0 이상 1미만의 double  데이터를 무작위로 추첨하는 명령
		// 0.xxxxxxxx 가 나오는 방법
		// Random 이라는 도구를 사용하는 방법
		
		double a = Math.random();
		double b = a*10;
		int c =(int)b ;
		int d = c+1;
		
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		System.out.println("c = "+c);
		System.out.println("d = "+d);
		
		//int number = (int)(Math.randdom() * 개수 ) + 시작;
		//  자바는 1부터 10까지라고 표현하지 않고 1부터 10개라고 표현함.
		int number = (int)(Math.random()*10) + 1;
		System.out.println("number = "+number);
		
		Random r = new Random();
		int number2 = r.nextInt(10);
		System.out.println("number2 = "+ number2);
	}
}
