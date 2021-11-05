package api.collection2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Test06_1 {
	public static void main(String[] args) {
		// 자동차 정보를 저장하고 검색하는 프로그램을 구현
		// 제공되는 라이브러리 기능을 이용하려면 비교기준에 대한 정의가 필요하다.
		
		Set<Car> items = new TreeSet<>();
		
		items.add(new Car("소나타", "중형", 15000000));
		items.add(new Car("소나타", "중형", 15000000));
		items.add(new Car("소나타", "중형", 15000000));
		items.add(new Car("아반떼", "중형", 12000000));
		items.add(new Car("레이", "소형", 9000000));
		
//		출력
		for(Car car : items) {
			System.out.println(car);
		}
	}
}
