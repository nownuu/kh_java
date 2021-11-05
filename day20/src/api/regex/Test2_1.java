package api.regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Test2_1 {
	public static void main(String[] args) {
		//5~20자의 영문 소문자, 숫자와 특수기호(_),(-)만 사용 가능합니다.
		// 첫글자는 소문자여야한다.
		
		System.out.println("아이디를 생성하십시오");
		Scanner sc = new Scanner(System.in);
		String id = sc.next();
		sc.close();
		
		String regex = "^[a-z][a-z0-9-_]{4,19}$";
		boolean result = Pattern.matches(regex, id);
		
		System.out.println("======================");
		
		 if(result) {
			 System.out.println("올바른 아이디 형식입니다.");
		 }
		 else {
			 System.out.println("아이디를 다시 설정하십시오");
		 }
	}
}
