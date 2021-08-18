package condition;
import java.lang.*;
import java.util.Scanner;
public class Test02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("여행갈 예정인 달 : ");
		int month = sc.nextInt();
		boolean amonth= month>=1 && month<=12;
		
		if(amonth) {
		System.out.println( month +"월");
		
		System.out.println("여행 갈 기간 : ");
		int day = sc.nextInt();
		sc.close();
		
		
		int summerM = 8;
		int unsummerM =10;
		
		boolean summer =  month>=6 && 8>=month ;
		
		int summerP = summerM*day;
		int unsummerP = unsummerM*day;
		
		
		if(summer) {
			System.out.println("여름 특가 적용 "+ summerP+"만원");
		}
		if(!summer) {
			System.out.println(unsummerP+"만원");
		}
		}
		
		if(!amonth) {
			System.out.println("올바르지 않는 답");
		}
	}
}
