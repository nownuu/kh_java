package character;
import java.lang.*;
public class Test01 {
	public static void main(String[] args) {
		// ASCII MS949 EUC-KR UTF-8
		// Q : 자바에서 글자는 어떻게 취급되는가?
		// A : 자바는 1글자에 2byte 형태로 관리합니다.
		// = 글자마다 숫자가 할당되어 있으며, 원한다면 언제든지 확인 가능하다.
		
		char a = '굿';
		System.out.println(a);
		
		char b = 44032;
		System.out.println(b);
		System.out.println((int)b);
		
		int c = a;
		System.out.println(c);
		
		//Q : d라는 변수에 들어있는 글자가 알파벳 대문장니지 판정해서 출력
		// ' 처럼 기호가 겹쳐서 사용이 어려운 글자들은 앞에 \를 추가하여 글자임을 명시
		// = Escape sequence  = 이스케이프문자
		char d = 'Q';
		
		
	}
}
