package oop.method5;

public class Test01 {

public static void main(String[] args) {
		
		Student a = new Student();
		Student b = new Student();
		Student c = new Student();
		
		//초기화
		a.init("마리오", 1, 90, 80, 70);
		b.init("루이지", 3, 85, 85, 83);
		c.init("루피", 3, 70, 60, 55);
		
		//변경
		
		
		//출력
		a.showInfo();
		b.showInfo();
		c.showInfo();
		
	}
}
