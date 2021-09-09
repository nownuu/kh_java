package api.util.scanner;

import java.util.Scanner;

public class Test05 {
	public static void main(String[] args) {
		// scanner 의 특수기능 ; 구분자(delimiter)설정
		// scanner는 기본 구분자가 공백이기 때문
		
		String colors = "빨 / 주 / 노 / 초 / 파 / 남 / 보";
		
		Scanner sc = new Scanner(colors);
		sc.useDelimiter("/"); // 슬래시를 구분하고 인지하고 읽어라
		
		while(sc.hasNext()) {
			System.out.println(sc.next());
		}
		sc.close();
	}
}
