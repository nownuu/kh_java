package jdbc.select2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Test01 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// Q : 번호를 이용한 상품정보 조회(product) 조회 (단일 조회)
		// ex : 3번 상품의 정보를 출력
		// 단일 조회
		
		// 입력
		int no = 3;
		
		// 처리
		Class.forName("oracle.jdbc.OracleDriver");
		System.out.println("OracleDriver connect");
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "kh";
		String password = "kh";

		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("Login");
		System.out.println("===================");
		
		String sql = "select * from product where no = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		
		if(rs.next()) {
			System.out.print(rs.getInt("no"));
			System.out.println(" / ");
			System.out.print(rs.getString("name"));
			System.out.println(" / ");
			System.out.print(rs.getInt("price"));
		}
		else { //없을 경우
			System.out.println("찾으시는 상품이 없습니다.");
		}
		con.close();
	}
}
