package oop.inner1;

public class Police {
	private Gun gun; // 경찰이 총을 가질 수 있다.

	public Gun getGun() {
		return gun;
	}

	public void setGun(Gun gun) {
		this.gun = gun;
	}
//경찰만이 권총을 사용할 수 있도록
// 경찰클래스 내부에 권총 클래스를 구현
	private class Gun{ //public class Gun 이었는데 경찰만 쓸수 있도록 private로 설정
		
	}
}
