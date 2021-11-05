package api.collection;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Test11 {
	public static void main(String[] args) {
		// 오디션 프로그램 투표
		
		List<Artist> db = new ArrayList<>();
		
		db.add(new Artist("문빈", "올라운더"));
		db.add(new Artist("달콩", "보컬"));
		db.add(new Artist("문콩", "메인댄서"));
		db.add(new Artist("달빈", "사장"));
		db.add(new Artist("달작","작가"));
		
		Scanner sc = new Scanner(System.in);
		System.out.println("투표할 사람의 이름을 입력하십시오");
		String name = sc.next();
		sc.close();
		
		// 출력
		for(int i = 0 ; i < db.size(); i++) {
			Artist art = db.get(i);
			System.out.println(art);
		}
		
		System.out.println();
		
		for(Artist art : db) {
			System.out.println(art);
		}
	}
}
