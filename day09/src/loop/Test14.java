package loop;
import java.util.Scanner;
public class Test14 {
	public static void main(String[] args) {
		
		int min = 3;
		int sec = 20;
		
		int time = min*60 + sec;
		System.out.println("time = "+ time);
		
		for(int i = time; i >= 0 ; i --) {
			System.out.println(i/60+"분"+i+"초 알람이 울립니다.");
			}
		
		System.out.println("시간이 다 되었습니다!");
	}
}

