package api.util.date;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test04 {
	public static void main(String[] arsg) {
		
		Date d = new Date();
	
		Format f1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Format f2 = new SimpleDateFormat("y년 M월 d일 E");
		Format f3 = new SimpleDateFormat("a h시 mm분 ss초");
		
		String time1 = f1.format(d);
		String time = f2.format(d);
		String time2 = f3.format(d);
		
		System.out.println(time1);
		System.out.println(time);
		System.out.println(time2);
	}
}
