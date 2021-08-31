package oop.method4;

public class Test01 {
	public static void main(String[] args) {
		
		Student a = new Student();
		Student b = new Student();
		Student c = new Student();
		
		//초기화
		a.init("피카츄", "응용SW기초기술 활용", 50, 60);
		b.init("라이츄", "응용SW기초기술 활용", 40, 80);
		c.init("파이리", "프로그래밍 언어 활용", 60, 65);
		
		//변경
		
		
		//출력
		a.showInfo();
		b.showInfo();
		c.showInfo();
		
	}
}
