package loop;
import java.lang.*;
import java.util.Scanner;
public class Test04 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		for(int i = 1 ; i <= 5 ; i ++ ) {
		String name = sc.next();
			System.out.println("이름" + name);
			
			
		}
		sc.close();	}
}
