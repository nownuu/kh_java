package logical;
import java.lang.*;
public class Test05 {
	public static void main(String[] args) {
		
		int n =12345;
		
		System.out.println(n == 12345);
		System.out.println(n != 1234);
		
		// n이 짝수 입니까?
		// = n을 2로 나눈 나머지가 0과 같습니까?
		//System.out.println(n %2 == 0);
		boolean even = n %2 == 0;
		System.out.println(even);
	}
}
