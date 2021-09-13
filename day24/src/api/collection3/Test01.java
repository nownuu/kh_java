package api.collection3;

import java.util.HashMap;
import java.util.Map;

public class Test01 {
	public static void main(String[] args) {
		//Map<K, V>
		// = 개별 처리에 특화된 저장소
		// = 데이터에 이름을 붙여서 관리하는 형태
		// = K 는 이름의 역할을 수행, V는 데이터의 역할을 수행
		// = K(key, 이름)는 중복이 불가능
		// = V(value)는 중복이 가능
		
		Map<String, Integer> record = new HashMap<>();
		
		record.put("피카츄", 50);
		record.put("라이츄", 70);
		record.put("파이리", 70);
		
		System.out.println(record);
		System.out.println(record.size());
		
		//검색 명령
		System.out.println(record.containsKey("피카츄"));
		System.out.println(record.containsValue(70));

		// 삭제 명령
		record.remove("피카츄");
		System.out.println(record);
		
		int score = record.get("라이츄"); // null이 나올 수 없는 경우
		//Integer score = record.get("라이츄"); //null이 나올 수 있는 경우
		System.out.println(score);
	}
}
