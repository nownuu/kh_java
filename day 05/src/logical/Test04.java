package logical;
import java.lang.*;
public class Test04 {
	public static void main(String[] args) {
		
		int limitspeedKm = 100;
		int permit = 10;
		
		int fixlimit = limitspeedKm * (100+permit)/100;
	
		System.out.println(fixlimit);
		
		double speedCarKm = 109;
		boolean limits =  speedCarKm  >=  fixlimit;
		
		System.out.println(limits);
	}
}
