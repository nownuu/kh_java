package blog;

import java.util.Scanner;

public class Nblog_3_1 {
	public static void main(String[] args) {
		
		String name = null;
		int height = 0 , weight = 0;
		// 입력
		Scanner sc = new Scanner(System.in);
		System.out.println("Input USER INFORMETION");
		System.out.print("Name : ");
		name = sc.nextLine();
		System.out.print("Height : ");
		height = sc.nextInt();
		System.out.print("Weight : ");
		 weight = sc.nextInt();
		
		sc.close();
		
		//처리
		float heightMeter = height / 100f;
		float bmi = weight / (heightMeter * heightMeter);
		float bmi2 = (int)(bmi * 100) / 100f;
		
		boolean overWeight = bmi >= 24.5f;
		
		//결과
		System.out.println("USER BMI = " +bmi2);
		System.out.println("USER OVERWEIGHT ? = "+overWeight);
	}
}
