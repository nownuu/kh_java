package loop2;
import java.util.Scanner;
public class Test03 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int total = 0;
		
		while(true) {
			System.out.println("숫자입력");
			int number = sc.nextInt();
			
			total += number;
			
			System.out.println(total);
			
			if(total >= 100) {
				break;
			}
		}
		System.out.println("Game over");
	}
}
