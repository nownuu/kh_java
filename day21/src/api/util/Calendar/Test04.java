package api.util.Calendar;

import java.util.Calendar;

public class Test04 {
	public static void main(String[] args) {
		
		
		Calendar c = Calendar.getInstance();
	
		c.set(Calendar.MONTH, 9);
		c.set(Calendar.DAY_OF_MONTH, 1);
		System.out.println(c.get(Calendar.YEAR) + "년 " + c.get(Calendar.MONTH) + "월 달력");
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		
		for(int i = 1 ; i <0 ; i++) {
			System.out.printf("%2d\t",i);
			switch(c.get(Calendar.DAY_OF_WEEK)) {
			case Calendar.SATURDAY:
			System.out.println();
			}
		}
		
	}
}
