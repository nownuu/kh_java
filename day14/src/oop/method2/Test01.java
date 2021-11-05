package oop.method2;

import oop.method2.Coffee;

public class Test01 {
	public static void main(String[] args) {
		Coffee a = new Coffee();
		Coffee b = new Coffee();
		Coffee c = new Coffee();
		Coffee d = new Coffee();
		
		a.init("아메리카노", "음료", 2000, true);
		b.init("프라푸치노", "음료", 3500);
		c.init("치즈케이크", "빵", 5000, true);
		d.init("유기농샌드위치","빵", 3000);
		
		//아메리카노 행사 중지 설정
		//a.isEvent = false;
		a.init("아메리카노", "음료", 2000, false);
		//치즈케이크 가격 6000원 인사
		//c.price = 6000
		c.init("치즈케이크","빵", 6000,true);
		
		a.showInfo();
		b.showInfo();
		c.showInfo();
		d.showInfo();
	}
}
