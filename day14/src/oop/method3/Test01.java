package oop.method3;

public class Test01 {
	public static void main(String[] args) {
		Toy t = new Toy();
		
		t.init("아기상어", 15000);
		t.showInfo();
		
		// 문제점
		// 정보를 변경하려면 무조건 두 개를 작성해야한다.
		//이게 싫으면 변수를 직접 컨트롤해야한다.
		// t.init("아기상어", 20000); //가격만 수정
		t.setPrice(20000);
		// t.init("baby Shark", 20000); // 이름과 가격 둘 다 수정
		t.setName("baby Shark");
		t.setPrice(20000);
		
		t.showInfo();
		
	}
}
