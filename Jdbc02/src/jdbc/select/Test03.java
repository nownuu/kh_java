package jdbc.select;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Test03 {
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
		
		String sql = "select * from product";
		System.out.println("상품 내역을 조회합니다.");
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		
		while(rs.next()) {
			System.out.println("\n"+ rs.getInt("no"));
			System.out.println(rs.getString("name"));
			System.out.println(rs.getString("type"));
			System.out.println(rs.getInt("price"));
			System.out.println(rs.getDate("made"));
			System.out.println(rs.getDate("expire"));
		}
		con.close();
		System.out.println("\n 조회완료");
	}
}
