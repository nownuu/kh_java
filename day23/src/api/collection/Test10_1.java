package api.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test10_1 {
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
		
		//반복문을 통해서 직접 회원의 아이디와 비밀번호를 비교
		Member find = null; // 찾는 회원이 없다고 가정
		for(Member m : list) {
			if(m.getID().equals(ID)&&m.getPassword().equals(password)){
			find = m;
			break;
			}
		}
		System.out.println("find = "+find);
		
		if(find != null) {
			System.out.println(find.getNickname()+"님 환영합니다.");
		}
		else {
			System.out.println("정보가 없습니다.");
		}
	}
}
