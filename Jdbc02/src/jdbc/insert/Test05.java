package jdbc.insert;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Test05 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "kh";
		String password = "kh";
		
		Class.forName("oracle.jdbc.OracleDriver");
		System.out.println("오라클 드라이브 접속 완료");
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("로그인 완료");
		System.out.println("=====================");
		
		Scanner sc = new Scanner(System.in);
		System.out.println("상품 이름 : ");
		String proName = sc.next();
		System.out.println("상품 유형 : ");
		String proType = sc.next();
		System.out.println("상품 가격 : ");
		int price = sc.nextInt();
		System.out.println("제조기한 : ");
		String proMade = sc.next();
		System.out.println("유통기한 : ");
		String proExpire = sc.next();
		sc.close();
		
		String sql = "insert into product (no, name, type, price, made, expire) values(product_seq, ?, ?, ?, "
									+ "to_date(?,'YYYY-MM-DD'), to_date(?, 'YYYY-MM-DD'))";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(2, proName);
		ps.setString(3, proType);
		ps.setInt(4, price);
		ps.setString(5, proMade);
		ps.setString(6, proExpire);
		
		ps.execute();
		con.close();
		System.out.println("=====================");
		System.out.println("등록 완료");
	}
}
