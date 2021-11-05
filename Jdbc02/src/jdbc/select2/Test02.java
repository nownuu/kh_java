package jdbc.select2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// 입력
		Scanner sc = new Scanner(System.in);
		System.out.println("== input User ID ==");
		String id = sc.next();
		
		// 처리
		Class.forName("oracle.jdbc.OracleDriver");
		System.out.println("OracleDriver connect");
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "kh";
		String password = "kh";

		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("Login");
		System.out.println("===================");
		
		String sql = "select * from exam  where exam_id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);
		ResultSet rs = ps.executeQuery();
		
		if(rs.next()) {
			System.out.print(rs.getString("exam_id"));
			System.out.print(" / ");
			System.out.print(rs.getString("student"));
			System.out.print(" / ");
			System.out.print(rs.getString("subject"));
			System.out.print(" / ");
			System.out.print(rs.getString("type"));
			System.out.print(" / ");
			System.out.print(rs.getInt("score"));
		}
		else {
			System.out.println("! NOT FIND");
		}
		
		con.close();
	}
}
