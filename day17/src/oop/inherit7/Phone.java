package oop.inherit7;

public class Phone {

	// 메인 변수
	
	protected String number, color;
	
	// 생성자
	public Phone(String number, String color) {
		this.setNumber(number);
		this.setColor(color);
	}
	
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}

	// 메소드
	public void call() {
		System.out.println("전화 기능 실행");
	}
	public void sms() {
		System.out.println("문자 기능 실행");
	}
}
