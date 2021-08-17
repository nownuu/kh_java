package total;

import java.lang.*;

public class Test01 {
	public static void main(String[] args) {
		
		int inH = 12, inM = 34;
		int outH = 15, outM = 21;
		
		int inTotal = inH*60 + inM;
		int outTotal = outH*60 + outM;
		
		int totalTime = outTotal - inTotal;
		int totalH = totalTime /60;
		int totalM = totalTime %60;
		
		System.out.println(totalH+"시간"+totalM+"분");
		
		
		int charge =  500;
		
		int useTime = totalTime/10;
		int needC= useTime*charge;
		
		System.out.println(needC+"원");
		
		
		boolean discount = (totalTime >120);
		
		System.out.println(discount);
	}
}
