package api.collection4;

import java.util.Stack;

public class Test02 {
	public static void main(String[] args) {
		//Stack 형식의 저장소를 사용하면 "이력관리"를 할 수 있다.
		// 되돌리기 명령 실행 시 pop()을 통하여 나온 데이터를 이용하여
		
		Stack<String> history = new Stack<>();
		
		history.push("http://www.google.com");
		history.push("http://www.naver.com");
		history.push("http://www.daum.net");
		
		System.out.println(history.pop());
	}
}
