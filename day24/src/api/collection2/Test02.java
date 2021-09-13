package api.collection2;

import java.util.Set;
import java.util.TreeSet;

public class Test02 {
	public static void main(String[] args) {
		// 숫자를 표현하는 트리셋
		
		Set<Integer> set = new TreeSet<>();
		
		set.add(5);
		set.add(7);
		set.add(3);
		set.add(1);
		set.add(4);
		set.add(9);
		set.add(6);
		
		System.out.println(set);
		System.out.println(set.size());
		
		// System.out.println(set.get(0)); // 될 수 없다.
	}
}
