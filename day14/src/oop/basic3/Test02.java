package oop.basic3;

public class Test02 {
	public static void main(String[] args) {
		
		Player a = new Player();
		Player b = new Player();
		Player c = new Player();
		
		a.init("김연아", "피겨스케이팅", 2, 0, 1);
		b.init("이상화", "스피드스케이팅", 1, 2, 1);
		c.init("윤성빈", "스켈레톤", 1, 0, 1);
		
		// this를 사용한 뒤의 출력
		a.showInfo(); // a를 주인공으로 해서 showInfo 코드 실행
		b.showInfo(); // b를 주인공으로 해서 showInfo 코드 실행
		c.showInfo(); // c를 주인공으로 해서 showInfo 코드 실행
		}
}
