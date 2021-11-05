
package jdbc.delete;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "kh";
		String password = "kh";
		
		Class.forName("oracle.jdbc.OracleDriver");
		System.out.println("OracleDriver connect");
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("Login");
		System.out.println("===================");
		
		// product 상품 번호 제거
		String sql =("delete from product  where no = ? ");
		PreparedStatement ps = con.prepareStatement(sql); 
		Scanner sc = new Scanner(System.in);
		System.out.println("삭제할 번호를 입력하십시오."); 
		int del_no = sc.nextInt();
		sc.close();
		 
		ps.setInt(1,del_no);
		
		int result = ps.executeUpdate();
		if(result == 0) {
			System.out.println("없는 번호입니다.");
		}
		else {
			System.out.println("삭제 성공");
		}
		
//		ps.execute();
		con.close();
		System.out.println("Finish");
	}
}