package oop.inherit8;

public abstract class Galaxy extends Phone{

	//생성자
	public Galaxy(String number, String color) {
		super(number, color);
	}

	public Galaxy(String color) {
		super(color);
	}
	
	// 추상 메소드
	public abstract void samsungPay();
}
