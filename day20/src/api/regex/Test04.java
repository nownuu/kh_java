package api.regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Test04 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("이메일을 입력하십시오");
		String email = sc.next();
		sc.close();
		
		String regex = "^[a-z0-9_-]{5,20}[@][a-z]{8,10}(\\.com|\\.net|\\.co\\.kr)$";
		boolean result = Pattern.matches(regex, email);
		
		System.out.println("======================");
		if(result) {
			 System.out.println("올바른 이메일 형식입니다.");
		 }
		 else {
			 System.out.println("이메일을 다시 설정하십시오");
		 }
	}
}
