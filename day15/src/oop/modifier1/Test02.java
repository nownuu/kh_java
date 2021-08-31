package oop.modifier1;

public class Test02 {
	public static void main(String[] args) {
		Student s = new Student();
		
		
		s.init("피카츄", 75);
		s.setScore(-75);
		
		s.showInfo();
		
	}
}
