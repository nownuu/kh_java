package api.lang.string;

import java.util.Scanner;

public class Test07 {
	public static void main(String[] args) {
		
		String[] Filter = {
				"주옥", "신발끈", "개나리", "십장생", "수박씨", "시베리아", "쌍화차", "가습기", "개불","게새우"
		};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("채팅을 하십시오.");
		String chat = sc.next();
		sc.close();
		
		for(int i = 0 ; i < Filter.length; i++) {
			chat = chat.replace(Filter[i], filt(Filter[i].length()));
		}
		
		System.out.println(chat);
		System.out.println("===========================");
		System.out.println("욕설은 자동 필터링이 되었습니다.");
	}
		
		public static String filt(int a) {
			String filt = "";
			for (int i = 0; i < a; i++) {
				filt += "*";
			}
			return filt;
	}
}
