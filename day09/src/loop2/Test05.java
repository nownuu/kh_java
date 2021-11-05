package loop2;

import java.util.Scanner;

public class Test05 {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		int total = 0;
		int count = 1;
		int wrong = 0;
		System.out.println("원하는 단수");
		int level = sc.nextInt();
		
		while(true) {
			System.out.println(level +"X" + count +"= ?");
			int answer = sc.nextInt();
			
			if(level*count == answer) {
				System.out.println("정답");
				count ++;
				total ++;
			}
			
			else {
				System.out.println("오답");
				wrong ++;
				if(wrong == 3) {
					break;
				}
			}
		}
		System.out.println("Game Over");
		System.out.println(total);
	}
}
	


