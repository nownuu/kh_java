package condition;
import java.lang.*;
import java.util.Scanner;
public class Test09 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("생년 4자리를 입력하세요");
		int birthYear = sc.nextInt();
		
		sc.close();
		
		int today = 2021;
		int year = today - birthYear + 1;
		
		System.out.println("나이 : "+ year);
		
		if (year >= 65 || year < 8) {
			System.out.println("무료");
		}
		else if(year >= 20 && year < 65){
			System.out.println("1,250원");
		}
		else if(year >= 14 && year <20) {
			System.out.println("720원");
		}
		else {
			System.out.println("450원");
		}
	}
}
