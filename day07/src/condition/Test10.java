package condition;
import java.lang.*;
import java.util.Scanner;
public class Test10 {
	public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
			System.out.println("몇 년생 입니까?");
				int birth = sc.nextInt();
	
				int thisYear = 2021;
				int age = thisYear - birth +1;
	
				System.out.println( "나이 : " +age);
	
				sc.close();
	
	int price;
	if (age >= 65 || age < 8) {
		price = 0;
	}
	else if(age >= 20) {
		price = 1250;
	}
	else if(age >= 14) {
		price = 720;
	}
	else {
		price = 450;
	}

	if (age >= 8 && age < 65) {
		price = price + 500;
	}
	
	System.out.println("가격 : "+price+"원");
		}
	}

