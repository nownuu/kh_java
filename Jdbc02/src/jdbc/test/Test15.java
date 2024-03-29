package jdbc.test;

import java.util.List;
import java.util.Scanner;

import jdbc.beans.ExamDao;
import jdbc.beans.ExamDto;

public class Test15 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String student = sc.nextLine();
		sc.close();
		
		ExamDao examDao = new ExamDao();
		List<ExamDto> list = examDao.searchByStudent(student);
		
		System.out.println("개수 : "+list.size());
		for(ExamDto examDto : list) {
			System.out.println(examDto.getExamId());
			System.out.print(" / ");
			System.out.print(examDto.getStudent());
			System.out.print(" / ");
			System.out.print(examDto.getSubject());
			System.out.print(" / ");
			System.out.print(examDto.getType());
			System.out.print(" / ");
			System.out.print(examDto.getScore());
		}
	}
}
