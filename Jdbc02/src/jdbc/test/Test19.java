package jdbc.test;

import jdbc.beans.ExamDao;
import jdbc.beans.ExamDto;

public class Test19 {
	public static void main(String[] args) throws Exception{
		
		int examID = 5;
		
		ExamDao examDao = new ExamDao();
		ExamDto examDto = examDao.select(examID);
		
		if(examDto == null) {
			System.out.println("해당 시험지는 존재하지 않습니다.");
		}
		else {
			System.out.println(examDto);
		}
	}
}
