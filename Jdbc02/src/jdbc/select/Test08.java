package jdbc.select;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Test08 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// 조건을 통한 필터링
		// = 목록과 출력 방식이 동일하다.
		
		// 입력
		Scanner sc = new Scanner (System.in);
		System.out.println("검색어를 입력하십시오");
		String search = sc.next();
		
		// 처리
		Class.forName("oracle.jdbc.OracleDriver");
		System.out.println("OracleDriver connect");
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "kh";
		String password = "kh";

		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("Login");
		System.out.println("===================");
		
		// 유사한 이름을 가지는 아이디나 닉네임조회
//		String sql = "select * from member  where member_id like '%'||?||'%' member_nick like '%'||?||'%'";
		String sql = "select * from member  where member_id like ? or member_nick like ? ";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, "%"+search+"%");
		ps.setString(2,  "%"+search+"%" );
//		ps.execute();
		ResultSet rs = ps.executeQuery();
		
		if(rs.next()) {
			System.out.print(rs.getString("member_id"));
			System.out.print(" / ");
			System.out.print(rs.getString("member_nick"));
			System.out.print(" / ");
			System.out.print(rs.getInt("member_point"));
		}
		else {
			System.out.println("인지하지 못했습니다.");
		}
		con.close();
	}
}
