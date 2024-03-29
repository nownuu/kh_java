package oop.inherit7;

public class IPhone12 extends IPhone{


	
	public IPhone12(String number, String color) {
		super(number, color);
	}

	public void faceTime() {
		System.out.println("아이폰12 영상통화 기능 실행");
	}
	@Override
	public void call() {
		System.out.println("아이폰12 전화 기능 실행");
	}
	@Override
	public void sms() {
		System.out.println("아이폰12 문자 기능 실행");
	}
	@Override
	public void siri() {
		System.out.println("아이폰12 음성인식 기능 실행");
	}
}
