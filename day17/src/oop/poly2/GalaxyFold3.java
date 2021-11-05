package oop.poly2;

public  class GalaxyFold3 extends Phone{


	@Override
	public void gallery() {
		System.out.println("갤럭시폴드3의 갤러리 이용");
	}
	@Override
	public void call() {
		System.out.println("갤럭시폴드3의 전화 이용");
	}
	@Override
	public void sms() {
		System.out.println("갤럭시폴드3의 문자 사용");
	}
	@Override
	public void camera() {
		System.out.println("갤럭시폴드3의 사진 촬영");
	}

}
