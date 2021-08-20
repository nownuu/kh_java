package condition;
import java.lang.*;
import java.util.Scanner;
public class Test05 {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("사용자의 이름 : ");
		String name = sc.next();
		System.out.print("국어 성적 : ");
		float korScore = sc.nextInt();
		System.out.print("영어 성적 : ");
		float engScore = sc.nextInt();
		System.out.print("수학 성적 : ");
		float mathScore = sc.nextInt();
		
		sc.close();
		
		int total = (int) (korScore + engScore + mathScore);
		float average = (float) total / 3;
		

		System.out.println("총점 : "+total);
		System.out.println("평균 : "+average);
		
		boolean pass = korScore>=40 && engScore>=40 && mathScore>=40 && average>=60;
		
		if(pass) {
			System.out.println("해당 평가 통과입니다.");
		}
		if(!pass) {
			System.out.println("재평가입니다.");
		}
	}
}