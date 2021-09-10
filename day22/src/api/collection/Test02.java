package api.collection;

import java.util.ArrayList;
import java.util.List;

public class Test02 {
	public static void main(String[] args) {
		//리스트 (list)
		// = 저장 순서를 유지(기억)하는 저장소
		// = 위치에 기반한 데이터 관리를 수행	
		
		List<String> list = new ArrayList<String>();
		
		list.add("아이유");
		list.add("김을동");
		list.add("박보영");
		list.add("차은우");
		list.add(1, "한지민"); // 중간 삽입 index가 1이 됨
		list.add("태연");
		
		// 출력
		System.out.println(list);
		
		//개수 확인 - size()
		System.out.println(list.size());
		
		// 검색 - contains() = ()이 저장소에 있는가?
		System.out.println(list.contains("태연"));
		System.out.println(list.contains("유재석"));
		
		// 확인 get(index)- 3번 위치에 있는 이름은 무엇입니까?
		System.out.println(list.get(3));
		
		// 전체 출력
		System.out.println("-----------");
		for(int i = 0 ; i < list.size() ; i ++) {
			System.out.println(list.get(i));
		}
		
		//삭제 - remove()
		
		list.remove("한지민");
		list.remove(0);
		
		System.out.println(list);
		System.out.println(list.size());
		
	}
}
