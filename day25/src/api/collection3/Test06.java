package api.collection3;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Test06 {
	public static void main(String[] args) {
		// map이 개별 저장소인건 알겠으나 전체 목록 출력은 아예 안되는건가?
		
	Map<String, Integer> map = new HashMap<>();
	
	map.put("피카츄", 75);
	map.put("라이츄", 65);
	map.put("파이리", 90);
	
	Set<String> set = map.keySet();
		for(String name : set) {
			System.out.println(name);
			System.out.println(map.get(name));
		}
	}
}
