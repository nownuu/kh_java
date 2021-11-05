package api.collection2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test07 {
	public static void main(String[] args) {
		// 집합 연산
		// = 서로 다른 두 집합 간의 연산
		// = 합집합, 교집합, 차집합
		
		//List<Integer> a = new ArrayList<>();
		List<Integer> a = Arrays.asList(10, 20, 30); // 불변 리스트
		List<Integer> b = Arrays.asList(20, 30, 40, 50);
		
		System.out.println(a);
		System.out.println(b);
		
		List<Integer> c = new ArrayList<>();
		c.addAll(a);
		c.addAll(b);
		System.out.println(c);
	}
}
