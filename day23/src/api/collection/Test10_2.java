package api.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test10_2 {
	public static void main(String[] args) {
		
		List<Member> list = new ArrayList<>();
		
		list.add(new Member("student", "student1234","수강생"));
		list.add(new Member("teacher","teacher1234","강사"));
		list.add(new Member("master", "master1234","관리자"));
		
		Scanner sc = new Scanner(System.in);
		System.out.println("아이디를 입력하십시오");
		String ID = sc.next();
		System.out.println("비밀번호를 입력하십시오");
		String password = sc.next();
		sc.close();
		
	// List의 기능을 활용하여 로그인 판정을 수행(equals, hashCode를 재정의)\
		Member user = new Member(ID, password);
		
		int index = list.indexOf(user); // user의 위치를 찾는다.
		System.out.println(index);
		
		if(index >= 0) {
			Member find = list.get(index);
			System.out.println(find.getNickname()+"환영합니다.");
		}
		else {
			System.out.println("정보가 없습니다.");
		}
	}
}
