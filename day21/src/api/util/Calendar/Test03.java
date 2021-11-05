package api.util.Calendar;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Test03 {
	public static void main(String[] args) {

		int count = 100;
		Calendar dday = Calendar.getInstance();
		
		dday.set(2021, Calendar.DECEMBER, 25);
		dday.add(Calendar.DATE, -count +1);
		Format f = new  SimpleDateFormat("yyyy-MM-dd");
		String time = f.format(dday.getTime());
		
		System.out.println("D-DAY까지 100일 전 날짜는 = " + time);
	}
}
