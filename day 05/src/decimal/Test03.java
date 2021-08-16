package decimal;

import java.lang.*;

public class Test03 {
	public static void main(String[] args) {
		
		int hours = 3;
		int minute = 35;
		int timeTotal = (hours*60 + minute);
		
		System.out.println(timeTotal);
		
		
		int yesterdayStudyHours = 2;
		int yesterdayStudyMinute = 50;
		
		int  todayStudyHours = 4;
		int  todayStudyMinute = 30;
		
		int yesterdayStudyTime = (yesterdayStudyHours*60 + yesterdayStudyMinute);
		int  todayStudyTime = (todayStudyHours*60 + todayStudyMinute);
	
		int totalTime = (yesterdayStudyTime + todayStudyTime);
		
		int totalTime2 = totalTime /60;
		int totalTime3 = totalTime %60;
		
		System.out.println(totalTime2);
		System.out.println(totalTime3);
		System.out.println(totalTime);
	}
}
