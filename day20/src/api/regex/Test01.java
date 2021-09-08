package api.regex;

import java.util.regex.Pattern;

public class Test01 {
	public static void main(String[] args) {
		//정규 표현식 (REGEX, REGular EXpresstion)
		//= 문자열을 검사하는 식
		//= 올바른 전화번호인지 검사
		
		String phoneNumber = "010-1212-3434";
		String regex = "^010-[0123456789][0123456789][0123456789][0123456789]-[0123456789][0123456789][0123456789][0123456789]$";
		
		boolean result = Pattern.matches(regex, phoneNumber);
		System.out.println(result);
	}
}
