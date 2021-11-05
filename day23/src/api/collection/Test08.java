package api.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Test08 {
	public static void main(String[] args) {
		// 네이버 사다리타기 구현
		
		Scanner sc = new Scanner(System.in);
		
		// 인원수 설정
		System.out.print("인원 수 설정 : ");
		int size = sc.nextInt();
		sc.nextLine();//엔터 제거

		if(size < 2 || size > 24) {
			System.err.println("인원을 2명 이상 24명 이하로 설정하세요");
			System.exit(-1);//비정상종료
		}
		
		// 이름 입력
		List<String> names = new ArrayList<>();
		for(int i = 0 ; i < size ; i ++) {
			System.out.println("이름 입력");
			String name = sc.next();
			names.add(name);
		}
		
		// 항목 입력
		List<String> games = new ArrayList<>();
		for(int i = 0 ; i < size; i ++) {
			System.out.println("항목 입력");
			String game = sc.next();
			games.add(game);
		}
		sc.close();
		
		Collections.shuffle(games);
		
		//System.out.println(names);
		//System.out.println(games);
		
		for(int i = 0 ; i < size ; i++) {
			System.out.print(names.get(i));
			System.out.print("\t▶\t ");
			System.out.print(games.get(i));
		}
	}
}
