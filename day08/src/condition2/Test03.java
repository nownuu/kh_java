package condition2;
import java.lang.*;
import java.util.Scanner;
public class Test03 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//사용자에게 시험점수 1개를 입력받아 성적등급을 출력하는 프로그램 구현

//- 등급 기준
	//- A등급 : 90점 이상 100점 이하
	//- B등급 : 70점 이상 90점 미만
	//- C등급 : 0점 이상 70점 미만

		System.out.println("시험 점수를 입력하세요.");
		int score = sc.nextInt();
		sc.close();
		
		String grade;
		switch (score/10) {
		case 10: case 9:
			grade = "A등급";
			break;
		case 8: case 7:
			grade = "B등급";
			break;
		default :
			grade = "C등급";
			break;
		}
	System.out.println(grade);
	}
	
}
