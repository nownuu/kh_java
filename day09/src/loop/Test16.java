package loop;

import java.util.Scanner;
public class Test16 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		
		int count = 0;
		
		for(int i =  1 ; i <=num ; i ++ ) {
			int n = num%i;
			
			if(n == 0) {
				count ++;
			}
		}
		if ( count  > 2 ) {
			System.out.println( "합성수 입니다.");
		}
		else {
			System.out.println("소수입니다.");
		}
	}
}
