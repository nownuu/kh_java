package jdbc.test;

import jdbc.beans.ExamDao;
import jdbc.beans.ExamDto;

public class Test01_1 {
	public static void main(String[] args) throws Exception {
		//ExamDto 모듈을 준비해서 데이터를 미리 포장한 뒤 등록하도록 처리
		
		//1. 모듈 객체 생성
		ExamDto examDto = new ExamDto();
		examDto.setStudent("거북왕");
		examDto.setSubject("데이터입출력구현");
		examDto.setType("서술형");
		examDto.setScore(80);
		//2. 등록 메소드 호출
		
		ExamDao examDao = new ExamDao();
		examDao.insert(examDto);
		System.out.println("Insert FINISH");
	}
}