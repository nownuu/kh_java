package blog;

import java.util.Scanner;

public class Nblog_3_4 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Input Year and Month");
		System.out.print("Year : ");
		int year = sc.nextInt();
		System.out.print("Month : ");
		int month = sc.nextInt();
		sc.close();
		
		int day = 0;
		if(month == 2) {
			boolean is400 = year % 400 == 0;
			boolean is100 = year % 100 == 0;
			boolean is4 = year % 4 == 0;
			
			if(is400 || (is4 && !is100)) {
				day = 29;
			}
		}
		else if(month == 4 || month == 6 || month == 9 || month == 11) {
			day = 30;
		}
		else {
			day = 31;
		}
		System.out.println("DAY : "+day);
	}
}
