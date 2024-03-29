package jdbc.test;

import java.util.List;

import jdbc.beans.ExamDao;
import jdbc.beans.ExamDto;

public class Test12 {

	public static void main(String[] args) throws Exception {
		
		ExamDao examDao = new ExamDao();
		List<ExamDto> list = examDao.select();
		
		//출력
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
