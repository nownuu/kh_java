package oop.modifier3;
import oop.modifier2.Phone;
public class Test01 {
	public static void main(String[] args) {
		// 다른 패키지에 있는 mobile 의 객체를 만들 수 있을까?
		// 자바는 모든 파일을 패키지 단위로 구분한다.
		// 접근제한에 대한 성명이 없으면 같은 패키지에서만 사용이 가능
		// 다른 패키지에서도 접근을 허용하고 싶으면 접근허용 키워드를 사용
		//public 키워드에 import를 추가하면 가능
		
		Phone a = new Phone();
		a.init("갤럭시폳드3", "SKT", 24, 200);
		
	}
}
