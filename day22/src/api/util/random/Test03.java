package api.util.random;

import java.util.Random;

public class Test03 {
	public static void main(String[] args) throws InterruptedException {
		
		// OTP(One Time PassWord, 일회용 비밀번호)
		// = 비밀번호는 이를 이ㅛㅇ하는 고객과 이를 확인하는 프로그램이 존재해야한다.
		// = 즉 2명 이상이 일정시간동안 동일한 랜덤번호를 알고 있어야 성립한다.
		
		Random r = new Random();
		
		while(true) {
			r.setSeed(1);// 시드를 맞추면 무조건 똑같은 값이 나온다.
			int otp = r.nextInt(1000000);
			System.out.println("otp = "+otp);
			
			Thread.sleep(100L);
		}
	}
}
