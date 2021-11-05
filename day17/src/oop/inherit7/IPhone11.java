package oop.inherit7;

public class IPhone11 extends IPhone{

	
	public IPhone11(String number, String color) {
		super(number, color);
	}
	
	public void itunes() {
		System.out.println("아이폰11 아이튠즈 실행");
	}
	@Override
	public void call() {
		System.out.println("아이폰11 전화 기능 실행");
	}
	@Override
	public void sms() {
		System.out.println("아이폰11 문자 기능 실행");
	}
	@Override
	public void siri() {
		System.out.println("아이폰11 음성인식 기능 실행");
	}
}
