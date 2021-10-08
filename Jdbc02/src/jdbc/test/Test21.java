package jdbc.test;

import java.util.Scanner;

import jdbc.beans.MemberDao;
import jdbc.beans.MemberDto;

public class Test21 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("회원 아이디를 입력하십시오");
		String memberID = sc.nextLine();
		sc.close();
		
		MemberDao memberDao = new MemberDao();
		MemberDto memberDto = memberDao.select(memberID);
		
		if(memberDto == null) {
			System.out.println("해당 회원은 존재하지 않습니다.");
		}
		else {
			System.out.println(memberDto); 
		}
	}
}
