package api.collection3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test05 {
	public static void main(String[] args) {
		// 렌트카 업체용 프로그램
		
		Map<String, Car> m = new HashMap<>();
		m.put("스타렉스", new Car("스타렉스", 11, 15));
		m.put("카니발", new Car("카니발", 7, 17));
		m.put("그랜저", new Car("그랜저", 4, 20));
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("대여하고 싶은 차종을 입력하십시오");
			System.out.println("=============================");
			String name = sc.next();
			
			if(name.equals("종료"	)) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			
			boolean isrent = m.containsKey(name); // 있으면

			
			if(! isrent) {
				System.out.println("해당하는 차종이없습니다");
			}
			else if(m.get(name).getRent()) {
				System.out.println("해당차량은 대여가 완료된 차종입니다");
			}
			else {	
				System.out.println(name + "을 대여합니다");
				m.get(name).noRent();
				
				break;
			}
		}
		sc.close();
	}
}