package api.util.Calendar;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test02 {
	public static void main(String[] args) {
		//Calendar 형태의 날짜 정보를 Date로 변환할 수 있는가?
		// 
		
		Calendar c = Calendar.getInstance();
		
		c.set(2021, Calendar.DECEMBER, 31);
		
		Date d = c.getTime();
		Format f = new SimpleDateFormat("yyyy-MM-dd E a H:mm:ss");
		System.out.println(f.format(d));
				
				
	}
}
