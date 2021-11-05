package character;
import java.lang.*;
public class Test03 {
	public static void main(String[] args) {
		
		System.out.println("안녕하세요" +1); // 안녕하세요1
		System.out.println("안녕하세요" +1 +2); //안녕하세요12
		
		int a = 10;
		int b =20;
		
		System.out.println("a = " +a);
		System.out.println("b=" +b);
		System.out.println("합계 ="+a+b);
		
		int total = a+b;
		
		System.out.println("합계 = " +total);
		
		String str =  "나는 지금\"피자\"가 먹고 싶다.";
		System.out.println(str);
		
		String str2 = "안녕\t하세요";
		System.out.println(str2);
	
		String str3 = "안\n녕\n하\n세\n요";
		System.out.println(str3);
		
		
		String str4 = "C:\\java";
		System.out.println(str4);
	}
}
