package loop3;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		// do ~ while 반복
		// 선 실행(do) 후 반복(while)을 수행하는 구문
		
		//ex : 사용자에게 점수를 입력받는 코드 구현. 잘못 입력하면 다시 입력하도록 처리
		
		Scanner sc = new Scanner(System.in);
		
		int score;
		
		do {
			// 점수를 입력받는 코드
			System.out.println("점수 입력");
			score = sc.nextInt();
		}
		while ( ! (score >= 0 && score <= 100));
		
		sc.close();
	}
}
