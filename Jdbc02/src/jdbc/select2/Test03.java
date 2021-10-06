package jdbc.select2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import jdbc.util.JdbcUtils;

public class Test03 {
	public static void main(String[] args) throws Exception {
		// 입력
		Scanner sc = new Scanner(System.in);
		System.out.println("== input User ID ==");
		String id = sc.next();
		
		// 처리

		Connection con = JdbcUtils.connect("kh", "kh");
		System.out.println("Login");
		System.out.println("===================");
		
		String sql = "select * from member  where member_id = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);
		ResultSet rs = ps.executeQuery();
		
		if(rs.next()) {
			System.out.print(rs.getString("member_id"));
			System.out.print(" / ");
			System.out.print(rs.getString("member_nick"));
			System.out.print(" / ");
			System.out.print(rs.getString("member_grade"));
			System.out.print(" / ");
		}
		else {
			System.out.println("! NOT FIND");
		}
		
		con.close();
	}
}
