package input;
import java.lang.*;
import java.util.Scanner;
public class Test04 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("본인의 이름 : ");
		String name =  sc.next();
		
		System.out.print("본인의 키 : ");
		float tall = sc.nextFloat();
		
		System.out.print("본인의 체중 : ");
		float weight = sc.nextFloat();
		
		sc.close();
		
		float bmiTall = tall/100*tall/100;
		
		float bmi = weight/bmiTall;
		
		bmi = (int)(bmi *100) / 100f;
		System.out.println("BMI : " + bmi);
		
		boolean overWeight = bmi>=24.5;
		System.out.print("과체중 여부 : " + overWeight);
		

		
	}
}
