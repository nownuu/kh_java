package condition;
import java.lang.*;
import java.util.Scanner;
public class Test11 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("여행 갈 달 : ");
		float month = sc.nextInt();
		
		if (month > 12) {
			System.out.print("옳지 않은 답");
		}
		
		System.out.println("여행 갈 기간 : ");
		float day = sc.nextInt();
		
		sc.close();
		
		float money = 10;
		
		float sale;
		
		if (month>=3 && month<=5) {
			sale = money*10/100;
		}
		else if(month>=6 && month<=8) {
			sale = money*40/100;
		}
		else if(month>=9 && month<=11) {
			sale = money*30/100;
		}
		else {
			sale = money*20/100;
		}
		
		float total = money - sale;
		int totalM = (int)( day * total);
		System.out.println("할인 받은 여행 비용 : " + totalM);
		
	}
}
