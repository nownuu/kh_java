import java.lang.*;

public class Calculate6 {
	public static void main(String[] args) {
		
		int adultPrice = 1250;
		int adultCount = 2;
		int teenagerPrice = 720;
		int teenagerCount = 2;
		int childPrice = 450;
		int childCount = 1;
		
		int adultTotal = adultPrice * adultCount;
		int teenagerTotal = teenagerPrice *teenagerCount;
		int childTotal = childPrice * childCount;
		
		int total = adultTotal + teenagerTotal + childTotal;
		
		System.out.println(adultTotal);
		System.out.println(teenagerTotal);
		System.out.println(childTotal);
		System.out.println(total);
	}

}
