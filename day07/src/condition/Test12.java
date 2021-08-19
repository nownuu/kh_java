package condition;
import java.lang.*;
import java.util.Scanner;
public class Test12 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("올린지 몇 초가 지났는가");
		int sec= sc.nextInt();
		
		int min = sec/60;
		int hour = min/60;
		int day = hour/24;
		
		if (sec<=10) {
			System.out.println("방금전");
		}
		else if(sec<60) {
			System.out.println(sec+"초 전");
		}
		else if(hour<1) {
			System.out.println(min+"분 전");
		}
		else if (day<1) {
			System.out.println(hour+"시간 전");
		}
		else if (day>=1) {
			System.out.println("오래 전");
		}
	}
}
