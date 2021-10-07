package jdbc.delete;

import jdbc.beans.ExamDao;
import jdbc.beans.ExamDto;

public class Test04 {
	public static void main(String[] args) throws Exception {
		
		// 입력
		ExamDto examDto = new ExamDto();
		examDto.setExamId(50);
		examDto.setStudent("또가스");
		examDto.setSubject("데이터입출력구현");
		examDto.setType("서술형");
		examDto.setScore(99);
		
		ExamDao examDao = new ExamDao();
		boolean isSuccess = examDao.updateStudent(examDto);

		if(isSuccess) {
			System.out.println("변경이 완료되었습니다.");
		}
		else {
			System.out.println("해당 번호의 정보가 없습니다.");
		}
	}
}
