package jdbc.beans;

import java.sql.Connection;
import java.sql.PreparedStatement;

import jdbc.util.JdbcUtils;

//Exam 테이블에 대한 데이터베이스 작업을 처리하는 클래스
//= DAO : Data Access Object (ex : 택배기사님)
//= 각각의 작업(CRRUD)들을 메소드 단위로 보관하고 호출하여 사용
public class ExamDao {
	public static final String USER = "kh", PASSWORD ="kh";
	//[1] 등록(Create) 메소드
	//= insert into exam(형식) values(번호, 이름, 과목, 유형, 점수)
	//= insert into exam(형식) values(exam_seq.nextval, ?, ?, ?, ?)
	public void insert(String student, String subject, String type, int score) throws Exception {
		Connection con = JdbcUtils.connect(USER, PASSWORD);
		
		String sql = "insert into exam values(exam_seq.nextval, ?, ?, ?, ?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, student);
		ps.setString(2, subject);
		ps.setString(3, type);
		ps.setInt(4, score);
		ps.execute();
		
		con.close();		
	}
/////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////
	// [1] 등록 메소드 만들기
	// 낱개 데이터가 아닌 의미 있는 단위로 데이터를 전달받도록 구현
	public void insert(ExamDto examDto) throws Exception{
		Connection con = JdbcUtils.connect(USER, PASSWORD);
		
		String sql = "insert into exam values(exam_seq.nextval, ?, ?, ?, ?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, examDto.getStudent());
		ps.setString(2, examDto.getSubject());
		ps.setString(3, examDto.getType());
		ps.setInt(4, examDto.getScore());
		ps.execute();
		
		con.close();		
	}
/////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////
	public boolean update (ExamDto examDto) throws Exception {
		Connection con = JdbcUtils.connect(USER, PASSWORD);
		
		String sql = "update exam set student = ?, subject = ?, type =?, score = ? "
					+ "where exam_id =?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, examDto.getStudent());
		ps.setString(2, examDto.getSubject());
		ps.setString(3, examDto.getType());
		ps.setInt(4, examDto.getScore());
		ps.setInt(5, examDto.getExamId());
		int result = ps.executeUpdate();
		
		con.close();
		
//		if(result > 0) {
//			retrun true;
//		}
//		else {
//			return false;
//		}
		return result > 0 ;
	}
/////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////
		public boolean updateStudent (ExamDto examDto) throws Exception {
			Connection con = JdbcUtils.connect(USER, PASSWORD);
			
			String sql = "update exam set student = ?, subject = ?, type =?, score = ? "
					+ "where exam_id =?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, examDto.getStudent());
			ps.setInt(2, examDto.getExamId());
			int result = ps.executeUpdate();
			
			con.close();
			
			return result > 0;
	}
}
