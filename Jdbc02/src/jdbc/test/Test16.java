package jdbc.test;

import java.util.List;

import jdbc.beans.ExamDao;
import jdbc.beans.ExamDto;

public class Test16 {
	public static void main(String[] args) throws Exception {
		//exam 테이블 항목, 검색어를 통한 검색
		
		//입력
		String column = "type";
		String keyword = "서술형";
		
		//처리
		ExamDao examDao = new ExamDao();
		List<ExamDto> list = examDao.select(column, keyword);
		
		//출력 : 목록때와 동일
		System.out.println("개수 : "+list.size());
		for(ExamDto examDto : list) {
			System.out.print(examDto.getExamId());
			System.out.print(" / ");
			System.out.print(examDto.getStudent());
			System.out.print(" / ");
			System.out.print(examDto.getSubject());
			System.out.print(" / ");
			System.out.print(examDto.getType());
			System.out.print(" / ");
			System.out.print(examDto.getScore());
			System.out.println();
		}
	}
}
