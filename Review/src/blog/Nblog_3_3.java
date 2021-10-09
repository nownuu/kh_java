package blog;

import java.util.Scanner;

public class Nblog_3_3 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Input Your Birth");
		int birth = sc.nextInt();
		int nowYear = 2021;
		int age = nowYear - birth +1;
		
		if(age < 8 || age > 65) {
			System.out.println("FREE USE Infants & elder");
		} else if(age >= 20) {
			System.out.println("Adult PRICE = 1,250");
		} else if(age >= 14) {
			System.out.println("Teen PRICE = 720");
		} else {
			System.out.println("Child PRICE = 450");
		}
	}
}
