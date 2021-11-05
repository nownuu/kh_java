package input;
import java.lang.*;
import java.util.Scanner;
public class Test03 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요");
		String name =  sc.next();
		
		System.out.print("국어 점수를 입력하세요");
		int korScore =  sc.nextInt();
		
		System.out.print("영어 점수를 입력하세요");
		int engScore = sc.nextInt();
		
		sc.close();
		
		int totalScore = korScore + engScore;
		float averageScore = totalScore/2f;
		
		System.out.println("이름 = " + name);
		System.out.println("총점 = " + totalScore +"점");
		System.out.println("평균 = " + averageScore +"점");
		

	}
}
