package api.collection;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Test11_4 {
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
			System.out.print("투표할 이름 : ");
			String name = sc.nextLine();
			
//			if(name == "그만") {//안됨
			if(name.equals("그만")) {
				break;
			}
			else {
				//검색 및 투표
				//= hashCode와 equals 설정되어 있으므로
				//= indexOf로 위치를 찾아서 확인 가능
				
				//int index = list.indexOf(name);//이름으론 안됨
				Artist art = new Artist(name);
				int index = db.indexOf(art);
				
				if(index >= 0) {//검색 결과가 있으면
					Artist find = db.get(index);
					find.vote();
					System.out.println("["+find.getName()+"] 투표가 완료되었습니다");
				}
				else {//검색 결과가 없으면
					System.out.println("찾으시는 이름의 후보가 없습니다");
				}
			}
		}
		sc.close();
		
		//투표수 순으로 정렬(투표수가 같으면 이름순 정렬)
		Comparator<Artist> c = new Comparator<Artist>() {
			@Override
			public int compare(Artist a, Artist b) {
				if(a.getCount() == b.getCount()) {//투표수가 같으면
					return a.getName().compareTo(b.getName());//이름 오름차순
				}
				else {//투표수가 다르면
					return b.getCount() - a.getCount();//투표수 내림차순
				}
			}
		};
		Collections.sort(db, c);
		
		//출력
		System.out.println("투표가 완료되었습니다");
		for(Artist art : db) {
			System.out.print("[");
			System.out.print(art.getName());
			System.out.print("-");
			System.out.print(art.getPosition());
			System.out.print("]");
			System.out.print(" ");
			System.out.print("득표수 : ");
			System.out.print(art.getCount());
			System.out.println();
		}
	}
}
