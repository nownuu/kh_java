package api.collection;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Test11_3 {
	public static void main(String[] args) {
		// 오디션 프로그램 투표
		
		List<Artist> db = new ArrayList<>();
		
		db.add(new Artist("문빈", "올라운더"));
		db.add(new Artist("달콩", "보컬"));
		db.add(new Artist("문콩", "메인댄서"));
		db.add(new Artist("달빈", "사장"));
		db.add(new Artist("달작","작가"));
		
		Scanner sc = new Scanner(System.in);
		while(true) {
		System.out.println("투표할 사람의 이름을 입력하십시오");
		String name = sc.next();
		if(name.equals("그만")) {
			break;
		}
	}
	sc.close();
		
		// 출력
		System.out.println("투표가 완료되었습니다.");
		for(Artist art : db) {
			System.out.println(art);
	}
	}
}
