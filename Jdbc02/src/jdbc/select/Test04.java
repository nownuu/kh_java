package jdbc.select;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Test04 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.OracleDriver");
		System.out.println("OracleDriver connect");
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "kh";
		String password = "kh";

		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("Login");
		System.out.println("===================");
		
		String sql = "select * from member";
		System.out.println("회원 내역을 조회합니다.");
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		
		while(rs.next()) {
			System.out.println("\n"+rs.getString("member_id"));
			System.out.println(rs.getString("member_pw"));
			System.out.println(rs.getString("member_nick"));
			System.out.println(rs.getDate("member_birth"));
			System.out.println(rs.getString("member_email"));
			System.out.println(rs.getString("member_phone"));
			System.out.println(rs.getInt("member_point"));
			System.out.println(rs.getString("member_grade"));
		}
		
		con.close();
		System.out.println("조회 완료");
	}
}
