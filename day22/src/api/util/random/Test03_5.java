package api.util.random;

import java.text.DecimalFormat;
import java.text.Format;
import java.util.Random;

public class Test03_5 {
	public static void main(String[] args) throws InterruptedException {
		
		//Format 클래스 중에 DecimalFormat 클래스를 이용하여 숫자 형식을 재설정
		
		Random r = new Random();
		Format f = new DecimalFormat("000000");
		
		while(true) { // 시간 + 고유정보 = 시드
			long time = System.currentTimeMillis() /1000; //1초마다 바뀜
			
			r.setSeed(time); //현재시간 관련된 처리는 유지하면서
			int otpA = r.nextInt(1000000);
			
			r.setSeed(time);// 값은 다르게  시드를 설정해야 번호의 차이가 발생
			int otpB= r.nextInt(1000000);
					
			System.out.println("A 사용자의 otp = "+f.format(otpA));
			System.out.println("B 사용자의 otp = "+ f.format(otpB));
			
			Thread.sleep(100L);
		}
	}
}
