package connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Test03 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.OracleDriver");
		System.out.println("오라클 드라이버 설치 완료");
		
		Connection con = DriverManager.getConnection
										("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
		System.out.println("로그인 성공");
		
		con.close();
		System.out.println("성공");
	}
}
