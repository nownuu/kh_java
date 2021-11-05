package decimal; //현재 이 파일의 위치가 첫 줄에 나와야한다.

// 정수를 변수에 저장
// 1. 변수의 형태마다 정해진 크기가 있으며 넘어갈 수 없다.
// 2. 
import java.lang.*;
public class test01 {
	public static void main(String[] args) {
		byte a = 10;
		System.out.println(a);
		
		int b = 210000000;
		System.out.println(b);
		
		long c = 2500000000000L; //long은 L표시를 추가한다.
		System.out.println(c);
		
		int d = 1234567 * 1234567;
		System.out.println(d);
		
		long e = 1234567L * 1234567L;
		System.out.println(e);
	}
}
