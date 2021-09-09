package api.util.random;

import java.text.DecimalFormat;
import java.text.Format;
import java.util.Random;

public class Test03_4 {
	public static void main(String[] args) {
		
		//Format 클래스 중에 DecimalFormat 클래스를 이용하여 숫자 형식을 재설정
		
		int a = 1234567890;
		System.out.println("a = "+a);
		
		Format f1 = new DecimalFormat("#,###");
		System.out.println("a = "+f1.format(a));		
	
		int b = 10;
		System.out.println("b = "+b);
		System.out.println("b = "+f1.format(b));
		
		Format f2 = new DecimalFormat("0,000");
		System.out.println("b = "+f2.format(a));
		System.out.println("b ="+f2.format(b));
	}
}
