package loop4;

public class Test01 {
	public static void main(String[] args) {
		// 반복문을 중첩해야하는 경우
		// 5번씩 3번
		// 가장 안쪽붜 구현하는 것이 좋음
		
		for(int i = 0 ; i <3 ; i ++) {//3번짜리 반복
			for(int j = 0 ; j < 5 ; j ++) {
		System.out.println("Hello World!");
			}
		}
	}
}
