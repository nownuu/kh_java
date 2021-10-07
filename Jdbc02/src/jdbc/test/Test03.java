package jdbc.test;

import java.util.Scanner;

import jdbc.beans.MemberDao;
import jdbc.beans.MemberDto;

public class Test03 {
	public static void main(String[] args) throws Exception {
		// 입력
		Scanner sc = new Scanner(System.in);
		MemberDto memberDto = new MemberDto();
		
		System.out.print("Input your ID : ");
		memberDto.setMemberId(sc.nextLine());
		System.out.print("Input your PASSWORD : ");
		memberDto.setMemberPw(sc.nextLine());
		System.out.print("Input your NICKNAME : ");
		memberDto.setMemberNick(sc.nextLine());
		System.out.print("Input your BIRTH : ");
		memberDto.setMemberBirth(sc.nextLine());
		System.out.print("Input your E-MAIL : ");
		memberDto.setMemberEmail(sc.nextLine());
		System.out.print("Input your PHONE NUMBER : ");
		memberDto.setMemberPhone(sc.nextLine());
		
		// 모듈 생성
		MemberDao memberDao = new MemberDao();
		memberDao.join(memberDto);
		
		System.out.println("Welcome.");
	}
}
