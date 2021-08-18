package input;
import java.lang.*;
import java.util.Scanner;
public class Test05 {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int startH = sc.nextInt();
		int startM = sc.nextInt();
		System.out.println("시작 시각 : " + startH + " 시간" + startM + " 분");
		
		
		int endH = sc.nextInt();
		int endM = sc.nextInt();
		System.out.println("종료 시각 : " + endH + " 시간 "+endM +" 분");
		
		sc.close();
		
		int pay = 600;
		int minpay = pay/60;
		
		int startT = startH*60 + startM;
		int endT = endH*60 + endM;
		
		int totalT = endT - startT;
		int totalH = totalT/60;
		int totalM = totalT%60;
		
		System.out.println("이용시간"+totalH+"시간"+totalM+"분");
		
		int totalPay = totalH*pay + totalM*minpay;
		
		System.out.println("계산된 이용 요금 : "+totalPay+"(원)");
		
		
	}
}
