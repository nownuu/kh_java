package api.collection2;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Test05 {
	public static void main(String[] args) {
		// set의 전체 추출 및 출력?
		// List에서 index를 이요한 반복이 가능했었으나 Set은 index가 없다.
		// Iterator 이용
		// 
		
		Set<String> languages = new TreeSet<>();
		
		languages.add("Java");
		languages.add("Python");
		languages.add("Javascript");
		languages.add("C++");
		languages.add("Go");
		
		System.out.println(languages);
		
		//1. 이터레이터를 사용하여 추출하는 방법
		
		Iterator<String>	iter = languages.iterator(); // set<String> ->Iterator<String> 으로 이동
		while(iter.hasNext()) {
			String name = iter.next();
			System.out.println("name = "+name);
		}
			
			// 2. 확장 for문을 이요해서 추출하는 방법
		for(String name : languages) {
			System.out.println("name = "+name);
		}
	}
}
