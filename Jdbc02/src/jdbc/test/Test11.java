package jdbc.test;

import java.util.Scanner;

import jdbc.beans.MemberDao;

public class Test11 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("삭제할 아이디를 입력하십시오");
		String memberID = sc.nextLine();
		
		MemberDao memberDao = new MemberDao();
		boolean success = memberDao.delete(memberID);
		
		if(success) {
			System.out.println("삭제 완료");
		}
		else {
			System.out.println("존재하지 않는 번호");
		}
	}
}
