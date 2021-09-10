package api.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		// 순서를 통하여 데이터를 관리하는 저장소
		
		List<String> list = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("나라이름을 하나씩 말하십시오");
		
		while(true) {
			String nation = sc.next();
			if(list.contains(nation)) {
				System.out.println("GAME OVER");
				break;
				}
			list.add(nation);
			}
		sc.close();
		
		System.out.println("=======================");
		System.out.println("성공 개수 = "+list.size()+"개");
		System.out.println("성공한 나라 이름");
		for(int i = 0 ; i <list.size() ; i ++) {
			System.out.print(list.get(i)+"\t/\t");
		}
	}
}
