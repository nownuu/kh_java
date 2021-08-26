package random;
import java.util.Random;
public class Test02 {
	public static void main(String[] args) {
		
	// 주사위 1개를 던진 결과
	int dice = (int)(Math.random()*6)+1;
	System.out.println("주사위 1개 돌린 결과 = "+ dice);
	
	// 로또 번호 1개를 추첨한 결과
	
	int lotto = (int)(Math.random()*45)+1;
	System.out.println("로또 번호 추첨 1개 = "+lotto);
	
	int otp = (int)(Math.random()*900000)+100000;
	System.out.println("OTP 번호 6자리 생성 = "+otp);
	}
}
