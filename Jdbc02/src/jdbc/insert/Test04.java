package jdbc.insert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "kh";
		String password = "kh";
		
		Class.forName("oracle.jdbc.OracleDriver");
		System.out.println("오라클 드라이브 접속 완료");
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("로그인 완료");
		System.out.println("=====================");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("학생 이름 : ");
		String stuName = sc.next();
		System.out.println("시험 과목 : ");
		String sjName = sc.next();
		System.out.println("시험 유형 : ");
		String sjType = sc.next();
		System.out.println("성적 : ");
		int score = sc.nextInt();
		sc.close();
		
		String sql = "insert into exam(exam_id, student, subject, type, score) values(exam_seq.nextval, ?, ?, ?, ?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, stuName);
		ps.setString(2, sjName);
		ps.setString(3, sjType);
		ps.setInt(4, score);
		
		ps.execute();
		con.close();
		System.out.println("=====================");
		System.out.println("등록 성공");
	}
}
