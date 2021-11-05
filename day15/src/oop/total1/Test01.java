package oop.total1;
import java.util.Scanner;
public class Test01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("정보를 입력하세요.");
		String id = sc.next();
		String secret = sc.next();
		String nickname = sc.next();
		sc.close();
		
		Program a = new Program(id, secret, nickname);
		
		a.showInfo();
	}
}
