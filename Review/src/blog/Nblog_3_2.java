package blog;

import java.util.Scanner;

public class Nblog_3_2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Input Number");
		int number = sc.nextInt();
		
		boolean even = number % 2 == 1;
		
		if(even) {
			System.out.println("홀수입니다.");
		}
		else {
			System.out.println("짝수입니다.");
		}
	}
}
