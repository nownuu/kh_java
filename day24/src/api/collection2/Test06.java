package api.collection2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Test06 {
	public static void main(String[] args) {
		// 자동차 정보를 저장하고 검색하는 프로그램을 구현
		// 제공되는 라이브러리 기능을 이용하려면 비교기준에 대한 정의가 필요하다.
		
		Set<Car> items = new HashSet<>();
		
		items.add(new Car("소나타", "중형", 1500));
		items.add(new Car("아반떼", "중형", 1200));
		items.add(new Car("레이","소형",900));
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("찾으시는 차종을 입력하십시오");
		String name = sc.next();
		Car find = null;
		for(Car c : items) {
			if(c.getName().equals(name)) {
				find = c;
				break;
			}
		}
		if(find == null) {
			System.out.println("찾으시는 차종이 없습니다.");
		}
		else {
			System.out.println(find.getName()+"에 대한 정보입니다.");
			System.out.println(find);
		}
	}
}
