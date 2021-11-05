package jdbc.select;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Test09_1 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// Q : product 테이블에서 원하는 항목에 맞는 검사를 수행
		// = 원하는 항목은 이름, 분류
		
		// 입력
		String kind = "name";
		String keyword = "바";
		
		// 처리
		Class.forName("oracle.jdbc.OracleDriver");
		System.out.println("OracleDriver connect");
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "kh";
		String password = "kh";

		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("Login");
		System.out.println("===================");
		
		//
		// 1,
//		String spl = "select * from product where instr("+kind+",?) > 0";
		// 2. 구문에 replace 명령을 사용하여 치환처리
		String sql = " select * from product where instr(#1, ? ) > 0";
		sql = sql.replace("#1", kind);
		System.out.println(sql);
		
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, keyword);
		ResultSet rs = ps.executeQuery();
		
		while(rs.next()) {
			System.out.print(rs.getString("name"));
			System.out.print(" / ");
			System.out.print(rs.getString("type"));
			System.out.print(" / ");
			System.out.print(rs.getString("price"));
			System.out.println();
		}
		
		con.close();
	}
}
