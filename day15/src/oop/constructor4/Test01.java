package oop.constructor4;

public class Test01 {
	public static void main(String[] args) {
		
		Hotel a = new Hotel("스텐다드룸", 4, 10, 20, 25);
		Hotel b = new Hotel("슈페이러룸", 4,  15, 25, 30);
		Hotel c = new Hotel("디럭스룸", 6, 30, 55);
		Hotel d = new Hotel("프리미엄룸", 8, 100);
		
		a.showInfo();
		b.showInfo();
		c.showInfo();
		d.showInfo();
		
	}
}
