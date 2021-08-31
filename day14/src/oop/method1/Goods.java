package oop.method1;

public class Goods {

	String name, code, group;
	int price;
	
	void init(String code, String name, String group, int price){
		this.code = code;
		this.name = name;
		this.group = group;
		this.price = price;
	}
	
	void showInfo() {
		System.out.println("마트 상품 정보");
		System.out.println("상품코드 = " + this.code);
		System.out.println("이름 ="+this.name);
		System.out.println("분류 = "+this.group);
		System.out.println("판매가격 = "+this.price);
	}
}
