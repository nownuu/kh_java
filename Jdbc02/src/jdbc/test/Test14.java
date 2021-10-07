package jdbc.test;

import java.util.List;

import jdbc.beans.MemberDao;
import jdbc.beans.MemberDto;

public class Test14 {
	public static void main(String[] args) throws Exception {
		MemberDao memberDao = new MemberDao();
		List<MemberDto> list = memberDao.select();
		
		System.out.println("개수 = "+list.size());
		for(MemberDto memberDto : list) {
			System.out.println(memberDto.getMemberId());
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
