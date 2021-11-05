package api.regex;

import java.util.regex.Pattern;

public class Test1_1 {
	public static void main(String[] args) {
		String id = "khstudent";
		String regex = "^아이디검사식$";
		
		boolean result = Pattern.matches(regex, id);
		System.out.println("result = " + result);
	}
}
