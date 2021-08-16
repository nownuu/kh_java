package decimal;

import java.lang.*;

public class homework01 {
	public static void main(String[] args) {
		
		int birth = 19990101;
		int today = 20210816;
		
		int birthYear = birth / 10000;
		int birthMonth = (birth%10000)/100;
		int birthDate = birth%100;
		
		int todayYear = today /10000;
		
		int korAge = todayYear - birthYear +1;
		
		System.out.println(korAge+"살");
		System.out.println(birthYear+"년");
		System.out.println(birthMonth+"월");
		System.out.println(birthDate+"일");
	}
}
