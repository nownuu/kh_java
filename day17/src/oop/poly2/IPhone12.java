package oop.poly2;

public class IPhone12 extends Phone{

	@Override
	public void camera() {
		System.out.println("아이폰12의 사진 촬영");
	}
	@Override
	public void gallery() {
		System.out.println("아이폰12의 갤러리 이용");
	}
	@Override
	public void call() {
		System.out.println("아이폰11의 전화 이용");
	}
	@Override
	public void sms() {
		System.out.println("아이폰11의 문자 사용");
	}
}
