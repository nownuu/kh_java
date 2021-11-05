package api.util.scanner;

import java.util.Scanner;

public class Test05_1 {
	public static void main(String[] args) {
		// scanner 의 특수기능 ; 구분자(delimiter)설정
		// = 구분자를 정규표현식(regex)로 설정 가능
		// = next()의 구분 기준이 재설정되며 nextLine()은 변하지 않는다.
		
		String colors = "빨+주,노?초/파=남-보";
		
		Scanner sc = new Scanner(colors);
		sc.useDelimiter("[+,?/=-]"); // 슬래시를 구분하고 인지하고 읽어라
		
		while(sc.hasNext()) {
			System.out.println(sc.next());
		}
		sc.close();
	}
}
