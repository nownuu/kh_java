package oop.keyword7;

public class Test01 {
	public static void main(String[] args) {
		// Sonata.setCompany("현대");
		
		Sonata a = new Sonata("현대", "블랙", 20);
		Sonata b = new Sonata("현대","그레이", 20);
		Sonata c = new Sonata("현대", "레드", 19);
		
		Sonata.setCompany("기아");
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}
