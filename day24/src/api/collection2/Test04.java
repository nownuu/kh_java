package api.collection2;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Test04 {
	public static void main(String[] args) {
		
		Set<Integer> set = new TreeSet<>();
		Random r = new Random();
		
		while(set.size() < 6) {
			int number = r.nextInt(45)+1;
			set.add(number);
		}
				System.out.println(set);
		
	}
}
