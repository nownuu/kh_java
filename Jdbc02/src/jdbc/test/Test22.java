package jdbc.test;

import java.util.Scanner;

import jdbc.beans.MemberDao;
import jdbc.beans.MemberDto;

public class Test22 {
	public static void main(String[] args) throws Exception {
		MemberDao memberDao = new MemberDao();
		MemberDto memberDto = new MemberDto();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("아이디를 입력하십시오");
		String memberID = sc.nextLine();
		
		// 아이디 검사
		if(memberDao.get(memberID) != null) {
			System.out.println("이미 사용중인 아이디입니다.");
			System.exit(0);
		}
		memberDto.setMemberId(memberID);
		
		System.out.print("비밀번호 : ");
		memberDto.setMemberPw(sc.nextLine());
		
		System.out.print("닉네임 : ");
		memberDto.setMemberNick(sc.nextLine());
		
		System.out.print("생년월일 : ");
		memberDto.setMemberBirth(sc.nextLine());
		
		System.out.print("이메일 : ");
		memberDto.setMemberEmail(sc.nextLine());
		
		System.out.print("전화번호 : ");
		memberDto.setMemberPhone(sc.nextLine());
		
		sc.close();
		
		//가입
		memberDao.join(memberDto);
		System.out.println("가입이 완료되었습니다.");
	}
}
