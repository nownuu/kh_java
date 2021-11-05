package logical;
import java.lang.*;
public class Test03 {
	public static void main(String[] args) {
		
		int birth = 2005;
		int todayYear = 2021;
		
		int year = todayYear - birth +1;
		
		System.out.println(year);
		
		boolean adult = year >=20;
		System.out.println(adult);
	}
}
