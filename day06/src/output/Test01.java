package output;
import java.lang.*;
public class Test01 {
	public static void main(String[] args) {
		
		System.out.println("안녕하세요1");
		System.out.println("안녕하세요2");
		System.out.println("안녕하세요3");
		
		System.out.print("안녕하세요4");
		System.out.print("안녕하세요5");
		System.out.print("안녕하세요6");
		
		//줄바꿈
		
		System.out.println();
		System.out.println("안녕하세요7");
		
		int a = 10;
		int b = 20;

		System.out.print("a = ");
		System.out.print(a);
		System.out.print(" , b = ");
		System.out.print(b);
		System.out.print("\n");

		System.out.println("a = " + a + " , b = " + b);

		System.out.printf("a = %d , b = %d\n", a, b);
			
	}
}
