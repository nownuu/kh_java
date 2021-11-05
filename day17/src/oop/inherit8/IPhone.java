package oop.inherit8;

public abstract class IPhone extends Phone{

	public IPhone(String number, String color) {
		super(number, color);
	}

	public IPhone(String color) {
		super(color);
	}

	// 추상 메소드
	public abstract void siri();
}
