package condition;
import java.lang.*;
import java.util.Scanner;
public class Test13 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("마지막 날짜를 알고 싶은 연도와 달을 입력하시오.");
		int year = sc.nextInt();
		int month = sc.nextInt();
		sc.close();
		
		int date;
		
		if (month == 3 || month == 5 || month == 7 || month == 8 || month == 9 || month == 11) {
			date = 31;
		}
		else if (month == 1 || month == 6 || month == 9 || month == 11) {
			date = 30;
		}
		
		else if (year/400 == 0) {
				date = 29;
			}
			else if(year/100 == 0) {
				date = 28;
			}
			else if(year/4 == 0) {
				date = 29;
			}
			else {
				date = 28;
			}
	
		System.out.println("마지막 날짜는 " + date+ "일 입니다." );

	}
}

		
		
