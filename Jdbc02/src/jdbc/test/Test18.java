package jdbc.test;

import java.util.List;
import java.util.Scanner;

import jdbc.beans.MemberDao;
import jdbc.beans.MemberDto;

public class Test18 {
	public static void main(String[] args) throws Exception {
		// 입력
		Scanner sc = new Scanner(System.in);
		System.out.println("IN PUT COLUMN");
		String column = sc.nextLine();
		System.out.println("IN PUT KEYWORD");
		String keyword = sc.nextLine();
		sc.close();
		//
		MemberDao memberDao = new MemberDao();
		List<MemberDto> list = memberDao.select(column, keyword);
		
		System.out.println("개수 = "+list.size());
		for(MemberDto memberDto : list) {
			System.out.print("\n"+ memberDto.getMemberId());
			System.out.print(" / ");
			System.out.print(memberDto.getMemberPw());
			System.out.print(" / ");
			System.out.print(memberDto.getMemberNick());
			System.out.print(" / ");
			System.out.print(memberDto.getMemberBirth());
			System.out.print(" / ");
			System.out.print(memberDto.getMemberEmail());
			System.out.print(" / ");
			System.out.print(memberDto.getMemberPhone());
			System.out.print(" / ");
			System.out.print(memberDto.getMemberJoin());
			System.out.print(" / ");
			System.out.print(memberDto.getMemberPoint());
			System.out.print(" / ");
			System.out.print(memberDto.getMemberGrade());
		}
	}
}
