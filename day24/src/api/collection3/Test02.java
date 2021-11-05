package api.collection3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		
		Map<String, Integer> db = new HashMap<>();
		
		db.put("K5", 1200);
		db.put("모닝", 500);
		db.put("BMW", 4000);
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("자동차의 이름을 입력하십시오");
			String name = sc.next();
			sc.close();
			if(db.containsKey(name)) {
				int price = db.get(name);
				System.out.println("해당 자동차의 가격은");
				System.out.println(price+"만원 입니다.");
			}
			else {
				System.out.println("잘못 입력했습니다.");
			}
			break;
		}
	}
}
