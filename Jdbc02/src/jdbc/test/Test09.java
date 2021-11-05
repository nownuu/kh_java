package jdbc.test;

import java.util.Scanner;

import jdbc.beans.ExamDao;

public class Test09 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("삭제할 번호를 입력하십시오");
		int examId = sc.nextInt();
		
		ExamDao examDao = new ExamDao();
		boolean success = examDao.delete(examId);
		
		if(success) {
			System.out.println("삭제 완료");
		}
		else {
			System.out.println("존재하지 않는 번호");
		}
	}
}
