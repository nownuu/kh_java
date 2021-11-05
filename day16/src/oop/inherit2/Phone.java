package oop.inherit2;

public class Phone {
	
	private String number; //멤버 변수

	public String getNumber() { // 멤버 메소드
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	
	public void call() {
		System.out.println("전화 기능 실행");
	}
	public void sms() {
		System.out.println("전화 기능 실행");
	}
	public void gallery() {
		System.out.println("갤러리 기능 실행");
	}
}
