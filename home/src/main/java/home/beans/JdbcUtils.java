package home.beans;

import java.sql.Connection;
import java.sql.DriverManager;

public class JdbcUtils {
	
	//연결 생성 메소드
	public static Connection connect(String user, String password) throws Exception {
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection(
							"jdbc:oracle:thin:@127.0.0.1:1521:xe", user, password);
		
		return con;
	}
}