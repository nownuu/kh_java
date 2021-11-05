package oop.method2;

public class Coffee {

	String name, type;
	int price;
	boolean isEvent;
	
	// 멤버 메소드
	// int 메소드는 2가지 버전으로 만들면 어떨끼?
	// 1. 이름 분류, 가격만 전달받으면 행사중이 아닌 상품으로 설정
	// 2. 이름, 분류, 가격, 행사여부까지 전달받으면 행사중인 상품으로 설정
	// 메소드 오버로딩 (Method Overloding)
	
	void init(String name, String type, int price) {
		this.name = name;
		this.type = type;
		this.price = price;
		// this.isEvent = event;
	}
	
	void init(String name, String type, int price, boolean isEvent) {
		this.name = name;
		this.type = type;
		this.price = price;
		this.isEvent = isEvent;
	}
	
	void showInfo(){
		System.out.println("커피숍 메뉴 정보");
		System.out.println(this.name);
		System.out.println(this.type);
	//	System.out.println(this.price);
	//	System.out.println(this.isEvent);
		
		if(this.isEvent) {
			int discount = this.price*(100-20)/100;
			System.out.println("메뉴  가격 = "+discount);
		}
		else {
			System.out.println("메뉴 가격 = "+this.price);
		}
	}
}
