package api.collection2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Test09 {
	public static void main(String[] args) {
		
		Set<String> hani = new TreeSet<>(Arrays.asList("소울","미나리","자산어보","서복","비와 당신의 이야기"));
		Set<String> dulli = new TreeSet<>(Arrays.asList("소울","내일의 기억","비와 당신의 이야기","크루엘라","발신제한"));
		
		Set<String>  two = new TreeSet<>();
		two.addAll(hani);
		two.addAll(dulli);
		System.out.println("하니와 둘리, 둘 중 한 명이라도 본 영화");
		System.out.println(two);
		System.out.println("총 "+two.size()+"개");
		
		System.out.println();
		Set<String> together = new TreeSet<>();
		together.addAll(hani);
		together.addAll(dulli);
		together.retainAll(hani);
		together.retainAll(dulli);
		System.out.println("하니와 둘리, 둘 다 본 영화");
		System.out.println(together);
		
		System.out.println();
		Set<String> a = new TreeSet<>();
		a.addAll(hani);
		a.removeAll(dulli);
		System.out.println("하니만 보고 둘리는 보지 않은 영화");
		System.out.println(a);
		
		System.out.println();
		Set<String> b = new TreeSet<>();
		b.addAll(dulli);
		b.removeAll(hani);
		System.out.println("둘리는 보고 하니는 보지 않은 영화");
		System.out.println(b);
	}
}
