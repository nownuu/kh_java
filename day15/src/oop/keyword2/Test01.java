package oop.keyword2;
import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		
	System.out.println("요구상항을 입력하세요");
	Scanner sc = new Scanner(System.in);
	System.out.println("제목");
	String title = sc.next();
	System.out.println("폭");
	int width = sc.nextInt();
	System.out.println("높이");
	int height = sc.nextInt();
	sc.close();
	
	User a = new User(title, width, height);
	
	a.showInfo();
}

}
