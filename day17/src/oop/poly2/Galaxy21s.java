package oop.poly2;

public class Galaxy21s extends Phone{

	@Override
	public void camera() {
		System.out.println("갤럭시21s의 카메라 기능 실행");
	}

	@Override
	public void gallery() {
		System.out.println("갤럭시21s의 갤러리 기능 실행");
	}

	@Override
	public void call() {
		System.out.println("갤럭시21s의 전화 기능 실행");
	}

	@Override
	public void sms() {
		System.out.println("갤럭시21s의 문자 기능 실행");
	}


}
