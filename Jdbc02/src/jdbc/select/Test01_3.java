package jdbc.select;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Test01_3 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Class.forName("oracle.jdbc.OracleDriver");
		System.out.println("OracleDriver connect");
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "kh";
		String password = "kh";

		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("Login");
		System.out.println("===================");
		
		String sql = "select * from menu";
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery(); // 실행 시킨 뒤 발생하는 결과집합(ResultSet)을 반환하라
		
		// 아래코드는 예외가 발ㅎ생한다.
		// ResultSet은 Connection이 연결된 동안만 사용할 수 있다.
		while(rs.next()) {
			System.out.println(rs.getString("menu_name"));
			System.out.println(rs.getInt("menu_price"));
			System.out.println(rs.getString("menu_type"));
		}

		
		con.close();
		System.out.println("조회 완료");
	}
}
