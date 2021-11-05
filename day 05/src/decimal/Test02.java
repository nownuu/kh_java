package decimal;

import java.lang.*;

public class Test02 {
	public static void main(String[] arsg) {
		
		int trianglekimbapPrice = 1000;
		int trianglekimbapCount = 9;
		
		int freeCount = trianglekimbapCount/3;
		int payCount = trianglekimbapCount -freeCount;
		int totalPrice = payCount * trianglekimbapPrice;
		
		System.out.println(totalPrice);
	}
}
