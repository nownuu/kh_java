package jdbc.delete;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Test02_1 {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "kh";
		String password = "kh";
		
		Class.forName("oracle.jdbc.OracleDriver");
		System.out.println("OracleDriver connect");
		Connection con = DriverManager.getConnection(url, user, password);
		System.out.println("Login");
		System.out.println("===================");
		
		// 아이디와 비밀번호를 받아 일치하는 회원정보 삭제
		String sql =("delete from member where member_id = ? and member_pw = ?");
		PreparedStatement ps = con.prepareStatement(sql); 
		Scanner sc = new Scanner(System.in);
		System.out.println("삭제할 아이디를 입력하십시오."); 
		String del_id = sc.next();
		System.out.println("삭제할 비밀번호를 입력하십시오."); 
		String del_pw = sc.next();
		sc.close();
		 
		ps.setString(1,del_id);
		ps.setString(2, del_pw);
		
//		ps.execute();
		int result = ps.executeUpdate();
		if(result  > 0) {
			System.out.println("삭제 성공");
		}
		else {
			System.out.println("탈퇴가 완료되었습니다.");
		}
		con.close();
		System.out.println("Finish");
	}
}
