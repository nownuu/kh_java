package oop.poly2;

class IPhone11 extends Phone{

	@Override
	public void camera() {
		System.out.println("아이폰11의 사진 촬영");
	}
	@Override
	public void gallery() {
		System.out.println("아이폰11의 갤러리 이용");
	}
	@Override
	public void call() {
		System.out.println("아이폰11의 전화 사용");
	}
	@Override
	public void sms() {
		System.out.println("아이폰11의 문자 보내기");
	}
}
