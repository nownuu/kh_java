package oop.modifier2;

public class Test01 {
	public static void main(String[] args) {
		Phone a = new Phone();
		a.init("갤럭시폳드3", "SKT", 24, 200);
		
		Phone b = new Phone();
		b.init("아이폰12", "KT", 24, 180);
		
		Phone c = new Phone();
		c.init("갤럭시21s", "LGplus", 30, 155);
		
		a.showInfo();
		b.showInfo();
		c.showInfo();
		
	}
}
