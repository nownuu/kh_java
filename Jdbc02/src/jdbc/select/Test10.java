package jdbc.select;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Test10 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// 입력
		Scanner sc = new Scanner(System.in);
        System.out.println("컬럼명 입력 : ");
        String kind = sc.nextLine();
        System.out.println("검색 키워드 입력 : ");
        String keyword = sc.nextLine();
        sc.close();
		
		//처리
		Class.forName("oracle.jdbc.OracleDriver");
		System.out.println("OracleDriver connect");
		
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "kh";
		String password = "kh";

		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("Login");
		System.out.println("===================");
		
		//
		String sql = "select * from member where instr(#1, ?) > 0 order by #1 asc";
		sql = sql.replace("#1", kind);
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, keyword);
		ResultSet rs = ps.executeQuery();
		
		while(rs.next()) {
			System.out.print(rs.getString("member_id"));
			System.out.print(" / ");
			System.out.print(rs.getString("member_nick"));
			System.out.print(" / ");
			System.out.print(rs.getString("member_email"));
			System.out.print(" / ");
			System.out.print(rs.getString("member_phone"));
			System.out.print(" / ");
			System.out.println(rs.getString("member_grade"));
		}
		con.close();
	}
}
