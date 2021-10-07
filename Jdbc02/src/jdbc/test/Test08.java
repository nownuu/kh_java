package jdbc.test;

import java.util.Scanner;

import jdbc.beans.MemberDao;
import jdbc.beans.MemberDto;

public class Test08 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("수정하려는 회원의 정보를 입력하십시오");
		MemberDto memberDto = new MemberDto();
		memberDto.setMemberId("ID = "+sc.nextLine());
		memberDto.setMemberPw("PassWord = "+sc.nextLine());
		memberDto.setMemberEmail("E-mail = " + sc.nextLine());
		memberDto.setMemberPhone("Phone Number"+sc.nextLine());
		//
		System.out.println("변경하려는 비밀번호를 입력하십시오");
		String changePW = sc.nextLine();
		//
		MemberDao memberDao = new MemberDao();
		boolean isSuccess = memberDao.updatePW(memberDto, changePW);
		
		if(isSuccess) {
			System.out.println("변경이 완료되었습니다.");
		}
		else {
			System.out.println("해당 번호의 정보가 없습니다.");
		}
	}
}
