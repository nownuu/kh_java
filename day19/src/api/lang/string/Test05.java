package api.lang.string;

import java.util.Scanner;

public class Test05 {
	public static void main(String[] args) {
		
		String[] record = new String[10];
		record[0] = "바나나";
		
		Scanner sc = new Scanner(System.in);
		for(int i = 1; i < record.length; i ++) {
		System.out.println("공포의 쿵쿵따 게임 시작");
		record[i] = sc.next();
		sc.close();
		}
		
		boolean isLengthOk = record[1].length() == 3;
		boolean isConnect = record[0].charAt(record[0].length()-1) == record[1].length();
		
		boolean isCorrect = isLengthOk && isConnect;
		
		if(isCorrect) {
			System.out.println("게임 끝");
		}
		else {
			System.out.println("게임 오버");
		}
	}
}
