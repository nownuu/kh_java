package loop2;

import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in) ;
	
		int evenCount = 0;
		int oddCount = 0;
	
		while(true) {
			System.out.println("숫자 입력");
			int number = sc.nextInt();
			System.out.println(number); 
			
			if(number == 0) {
				break;
				}
			
			else {
				if(number%2 != 0 ) {
					oddCount ++;
				}
				else{
					evenCount ++;
				}
			}
		}
		
	System.out.println("짝수는 " + evenCount + "개입니다.");
	System.out.println("홀수는 " + oddCount + "개입니다.");
		}
}
	
