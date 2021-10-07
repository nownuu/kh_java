package jdbc.update;

import java.util.Scanner;

import jdbc.beans.MemberDao;
import jdbc.beans.MemberDto;

public class Test07 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("수정하려는 회원의 정보를 입력하십시오");
		MemberDto memberDto = new MemberDto();
		memberDto.setId("ID = "+sc.nextLine());
		memberDto.setPassword("PassWord = "+sc.nextLine());
		memberDto.setNick("NickName = "+sc.nextLine());
		memberDto.setBirth("Birth = " + sc.nextLine());
		memberDto.setEmail("E-mail = " + sc.nextLine());
		memberDto.setPhone("Phone Number"+sc.nextLine());
		
		MemberDao memberDao = new MemberDao();
		boolean isSuccess = memberDao.update(memberDto);
		
		if(isSuccess) {
			System.out.println("변경이 완료되었습니다.");
		}
		else {
			System.out.println("해당 번호의 정보가 없습니다.");
		}
	}
}
