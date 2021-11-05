package api.collection2;

import java.util.HashSet;
import java.util.Set;


public class Test03 {
	public static void main(String[] args) {
		
		
	Set<Integer> set = new HashSet<>();
		
		set.add(5);
		set.add(7);
		set.add(13);
		set.add(21);
		set.add(45);
		set.add(93);
		set.add(65);
		
		System.out.println(set);
		System.out.println(set.size());
	}
}
