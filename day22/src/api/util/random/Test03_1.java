package api.util.random;

import java.util.Random;

public class Test03_1 {
	public static void main(String[] args) {
		
		// 일정시간 동안 동일한 값이 나오게 시간 정보를 조작
		
		Random r = new Random();
		
		while(true) {
			// long time = System.currentTimeMillis() / 1000 / 10; // 10초마다 바뀜
			// long time = System.currentTimeMillis() / 1000 / 60; // 60초마다 바뀜
			long time = System.currentTimeMillis() / 1000 / 10; // 72초마다 바뀜
			
			r.setSeed(time);
			int otp = r.nextInt();
			System.out.println("time = "+time);
		}
	}
}
