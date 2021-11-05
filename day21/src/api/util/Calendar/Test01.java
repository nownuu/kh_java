package api.util.Calendar;

import java.util.Calendar;

public class Test01 {
	public static void main(String[] args) {
		
		//Calendar 클래스를 이용하여 날짜 제어
		// = 추상 클래스이며 생성자가 protected이므로 객체 생성이 불가능
		
		//Calendar c = new Calendar(); // 오류 발생
		Calendar c = Calendar.getInstance(); // 생성 메소드를 이용해야함
		
		// 시각 정보 변경
		// c.set(무엇을, 얼마로);
		c.set(Calendar.YEAR, 1998);
		c.set(Calendar.MONTH, 9);
		c.set(Calendar.DATE, 1);
		
		System.out.println(c.get(Calendar.YEAR));
		System.out.println(c.get(Calendar.MONTH)); //실제 월보다 한달 적게 나옴
		System.out.println(c.get(Calendar.DATE)); //day of month의 별칭
		System.out.println(c.get(Calendar.DAY_OF_MONTH)); //Date와 동의어
		System.out.println(c.get(Calendar.HOUR_OF_DAY)); //24시간 방식
		System.out.println(c.get(Calendar.HOUR)); //12시간 방식
		System.out.println(c.get(Calendar.MINUTE));
		System.out.println(c.get(Calendar.SECOND));
		System.out.println(c.get(Calendar.MILLISECOND)); //밀리초
		
		System.out.println(c.get(Calendar.AM_PM));
		System.out.println(c.get(Calendar.DAY_OF_WEEK));
	}

}
