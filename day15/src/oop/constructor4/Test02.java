package oop.constructor4;

public class Test02 {
	public static void main(String[] args) {
		
		// 배열로 표현
		Hotel[] arr = new Hotel[4];
		
		arr[0] = new Hotel("스텐다드룸", 4, 10, 20, 25);
		arr[1] = new Hotel("슈페이러룸", 4,  15, 25, 30);
		arr[2] = new Hotel("디럭스룸", 6, 30, 55);
		arr[3] = new Hotel("프리미엄룸", 8, 100);
		
		arr[0].showInfo();
		arr[1].showInfo();
		arr[2].showInfo();
		arr[3].showInfo();
		
	}
}
