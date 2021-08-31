package oop.constructor3;

public class Test01 {
	public static void main(String[] args) {
		//객체 생성
		Game a = new Game("뽀로로", "전사", 50, 50000);
		Game b = new Game("크롱", "마법사", 35, 20000);
		Game c = new Game("루피", "전사", 1, 0);
		
		a.showInfo();
		b.showInfo();
		c.showInfo();
	}
}
