package jdbc.select;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Test02 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// 로그인
		Class.forName("oracle.jdbc.OracleDriver");
		System.out.println("OracleDriver connect");
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "kh";
		String password = "kh";

		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("Login");
		System.out.println("===================");
		
		String sql = "select "
					+ "exam_id \"번호\", "
					+ "student \"학생명\", "
					+ "subject \"과목\", "
					+ "type \"유형\", "
					+ "score \"점수\" "
					+ "from exam";
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();

		while(rs.next()) {
			System.out.println("\n"+rs.getInt(1));		//rs.getInt("번호")
			System.out.println(rs.getString(2));	//rs.getString("학생명")
			System.out.println(rs.getString(3));	//rs.getString("과목")
			System.out.println(rs.getString(4));	//rs.getString("유형")
			System.out.println(rs.getInt(5));		//rs.getInt("점수")
			}

		con.close();
		System.out.println("조회 완료");
	}
}
