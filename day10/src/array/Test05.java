package array;

import java.util.Scanner;

public class Test05 {
	public static void main(String[] args) {
		
	    String[] name = new String[5];
		
		Scanner sc = new Scanner(System.in);

		for(int i = 0 ; i < 5 ; i++) {
			System.out.println("이름 입력");
			name[i] = sc.next();
		}
		sc.close();
		
		for(int i = 0 ; i < 5 ; i++) {
			System.out.println(name[i]);
		}
	}
}
