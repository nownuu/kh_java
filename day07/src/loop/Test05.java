package loop;
import java.lang.*;
import java.util.Scanner;
public class Test05 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		
		sc.close();
		
		for(int i = 1 ; i <= 9 ; i++) {
			System.out.println(number + "X" + i +"="+(number*i));
		}
	
	}
}
