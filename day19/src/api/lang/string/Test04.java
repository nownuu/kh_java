package api.lang.string;

import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("이메일을 입력하시오");
		System.out.println("이메일은 반드시 @가 포함되어야합니다.");
		String email = sc.next();
		sc.close();
		
		boolean isemail = email.endsWith(".com") && email.contains("@");
		
		boolean unemail1 = email.length()>50 || email.length()<5;
		boolean unemail2 = email.startsWith("@");
		boolean unemail3 = email.contains("admin");
		
		if(unemail1) {
			System.out.println("이메일을 다시 입력하십시오");
		}
		else if(unemail2) {
			System.out.println("이메일을 다시 입력하십시오");
		}
		else if(unemail3) {
			System.out.println("이메일을 다시 입력하십시오");
		}
		else if(isemail) {
			System.out.println("이메일 설정 완료");
		}
		else {
			System.out.println("이메일을 다시 입력하십시오");
		}
	}
}
