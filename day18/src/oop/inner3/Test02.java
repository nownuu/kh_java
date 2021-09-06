package oop.inner3;

public class Test02 {
	public static void main(String[] args) {
		// 버튼을 그때그때 상속받아서 서로 다른 기능을 가지도로 구현하자
		// 익명 중첩 클래스
		// 클래스의 몸통만 가져와서 객체 생성시 즉석에서 상속
		// 일회용 코드를 작성하기 편리하다.
		// 상속이 불가능한 클래스(final class)는 사용 불가
		// 추상 클래스, 인터페이스 객체도 생성
		
		Button button1 = new Button() {

			@Override
			public void push() {
				System.out.println("메뉴를 표시합니다.");
			}
		};
		button1.push();
		
		Button button2 = new Button() {

			@Override
			public void push() {
				System.out.println("종료함니데이");
			}
		};
		button2.push();
	}
}
