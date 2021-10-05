package jdbc.update;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
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
		
		// product 상품 번호를 입력받아 가격 수정
		String sql =("update from product  set price =? where no = ?");
		PreparedStatement ps = con.prepareStatement(sql); 
		Scanner sc = new Scanner(System.in);
		System.out.println("수정할 번호를 입력하십시오."); 
		int no = sc.nextInt();
		System.out.println("수정할 상품의 가격을 입력하십시오.");
		int price = sc.nextInt();
		sc.close();
				 
		ps.setInt(1,no);
		ps.setInt(2, price);
				
		int result = ps.executeUpdate();
		if(result > 0) {
			System.out.println(no+"번의 상품 수정 완료.");
		}
		else {
			System.out.println("수정 실패");
		}

		con.close();
		System.out.println("Finish");
	}
}
