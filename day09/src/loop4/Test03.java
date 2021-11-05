package loop4;

import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		
		int start = 0;
		int end = 0;
		int count = 0;
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("시작 구간");
			start = sc.nextInt();
			
			System.out.println("마지막 구간");
			 end = sc.nextInt();
			 
			 if(start>end) {
				 System.out.println("오류입니다. 다시 입력하십시오.");
			 }
			 else {
				 break;
			 }
			}

		for (int num = start ; num <= end ; num++) {
			for (int i = num ; i > 0 ; i /= 10) {
				if (i % 10 == 3 || i % 10 == 6 || i % 10 == 9)
					count++;
			}
		}
		System.out.println("박수 count는 = "+count);
	}
}
