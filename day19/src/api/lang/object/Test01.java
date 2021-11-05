package api.lang.object;

import java.util.Random;

public class Test01 {
	public static void main(String[] args) {
		// Object 객체 생성
		Object a= new Object();
		Object b= new Object();
		
		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
		System.out.println(a.toString());
		System.out.println(b.toString());
		
		Random c = new Random();
		System.out.println(c.hashCode());
		System.out.println(c.toString());
	}
}
