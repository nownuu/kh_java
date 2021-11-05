package jdbc.select;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Test01 {
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
		
		// 사용할 수 있는 명령
		// 1. rs.next() : 다음 줄로 포커스를 이동하는 명령(true / false)
		// 2. rs.get~~( : 포커스가 위치한 줄의 컬럼을 읽는 명령
		System.out.println(rs.next()); //다음 줄로 이동하며 데이터 유무를 출력하라
		System.out.println(rs.getString("menu_name"));
		System.out.println(rs.getInt("menu_price"));
		System.out.println(rs.getString("menu_type"));
		
		con.close();
		System.out.println("조회 완료");
	}
}
