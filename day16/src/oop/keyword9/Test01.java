 package oop.keyword9;

public class Test01 {
	public static void main(String[] args) {
		
		Bank a = new Bank("유재석", 0.3f, 5000000);
		Bank b = new Bank("강호동", 0.5f, 3500000);
		Bank c = new Bank("신동엽", 0.2f, 8000000);
		
		
		a.showInfo();
		b.showInfo();
		c.showInfo();
	}
}
