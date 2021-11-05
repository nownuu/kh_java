package input;
import java.lang.*;
import java.util.Scanner;
public class Test02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		System.out.println("a = " + a);
		
		String b = sc.next();
		System.out.println("b = " + b);
		
		sc.close();
	}
}
