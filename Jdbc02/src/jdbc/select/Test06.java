package jdbc.select;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Test06 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// 조건을 통한 필터링
		// = 목록과 출력 방식이 동일하다.
		
		// 입력
		Scanner sc = new Scanner (System.in);
		System.out.println("최소값을 입력하십시오");
		int minPrice = sc.nextInt();
		System.out.println("최대값을 입력하십시오");
		int maxPrice = sc.nextInt();
		
		// 처리
		Class.forName("oracle.jdbc.OracleDriver");
		System.out.println("OracleDriver connect");
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "kh";
		String password = "kh";

		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("Login");
		System.out.println("===================");
		
		String sql = "select * from menu where menu_price between ? and ?";
		PreparedStatement ps = con.prepareStatement(sql);
		
		ps.setInt(1, minPrice);	
		ps.setInt(2, maxPrice);
		ResultSet rs = ps.executeQuery();
		
		while(rs.next()) {
			System.out.print("\n"+rs.getString("menu_name"));
			System.out.print(" / ");
			System.out.print(rs.getInt("menu_price"));
			System.out.print(" / ");
			System.out.print(rs.getString("menu_type"));
		}
		con.close();
	}
}
