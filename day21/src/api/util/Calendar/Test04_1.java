package api.util.Calendar;

import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Test04_1 {
	public static void main(String[] args) {
		
		ArrayList<Integer>cArr = new ArrayList<>(); // 배열
		Calendar c = Calendar.getInstance();
		
		int year = 2021; //입력
		int month = 9;
		
		System.out.println(year + "년\t" + month +"월");
		System.out.println("---------------");
		
		year = c.get(Calendar.YEAR);
		month = c.get(Calendar.MONTH);
		int date = c.get(Calendar.DATE);
		int lastDay = c.getActualMaximum(Calendar.DATE); // 기본 세팅
		
		c.set(Calendar.DATE, 1); // 지난 달 세팅 시작 (1)
		int first = c.get(Calendar.DAY_OF_WEEK);
		int preMonth = first - 1;
		c.add(Calendar.MONTH, -1);
		lastDay = c.getActualMaximum(Calendar.DATE);
		
		for(int i = 0 ; i <lastDay ; i++) { //현재 달
			cArr.add(i+1);
		}
		
		for(int i = 0 ; i <preMonth ; i++) { //지난 달
			cArr.add(0,lastDay);
			lastDay--;
		}
		
		System.out.println("일\t월\t화\t수\t목\t금\t토"); // 출력 시작
		for(int i = 0; i < cArr.size(); i++) {
			System.out.print(cArr.get(i)+"\t");
			if(i % 7 == 6) {
				System.out.println();
			}
		}
	}
}
