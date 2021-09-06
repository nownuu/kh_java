package api.lang.string;

public class Test03 {
	public static void main(String[] args) {
		// 문자열의 부분비교
		// = 문자열의 특정 값으로 시작합니까?
		// = 문자열이 특정 값으로 끝납니까?
		// = 문자열에 특정값이 포함되어 있습니까?
		// = 문자열에 특정 값이 어디에 있습니까?
		
		String homepage= "http://www.naver.com";
		
		System.out.println(homepage.startsWith("http")); //http로 시작하나요?
		System.out.println(homepage.endsWith(".com")); // .com으로 끝나나요?
		System.out.println(homepage.contains("naver")); // naver 글자 포함?
		System.out.println(homepage.indexOf("naver")); // naver 글자 어디에 있어?(우측)
		
	}
}
