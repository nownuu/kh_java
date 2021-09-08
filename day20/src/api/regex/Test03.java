package api.regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Test03 {
	public static void main(String[] args) {
		
		// 사용자가 입력한 이름이 올바른 형식인지 검사하여 출력
		
		System.out.println("이름을 입력하십시오");
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		sc.close();
		
		String regex = "^[가-힣\\s]{3,9}$";
		boolean result = Pattern.matches(regex, name);
		
		System.out.println("======================");
		if(result) {
			 System.out.println("올바른 이름 형식입니다.");
		 }
		 else {
			 System.out.println("이름을 다시 설정하십시오");
		 }
	}
}
