import java.lang.*;

public class Calculate4 {
	public static void main (String[] args) {
		
		// Q : 5000원짜리 자장면 2 그릇과 6000원짜리 짬뽕 2그릇을 주문할 때의 각 메뉴의 총가격과 가격의 합계는?
		
		int chinaNoodlePrice = 5000;
		int chinaNoodleCount = 2;
		int champonPrice = 6000;
		int champonCount= 2;
		
		int chinaNoodleTotal = chinaNoodlePrice * chinaNoodleCount; 
		int champonTotal = champonPrice * champonCount; 
		int total = chinaNoodleTotal + champonTotal;
		
		System.out.println(chinaNoodleTotal);
		System.out.println(champonTotal);
		System.out.println(total);
	}
}