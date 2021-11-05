package jdbc.update;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		// 입력 준비
		Scanner sc = new Scanner(System.in);
		System.out.println("아이디를 입력하십시오");
		String id = sc.next();
		System.out.println("비밀번호를 입력하십시오");
		String pw = sc.next();
		System.out.println("변경할 닉네임을 입력하십시오");
		String up_nick = sc.next();
		System.out.println("변경할 이메일을 입력하십시오");
		String up_email = sc.next();
		System.out.println("변경할 전화번호를 입력하십시오");
		String up_phone = sc.next();
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
		String sql = "Update member "
				+ "set member_nick = ?, member_email = ?, member_phone = ? "
				+ "where member_id = ? and member_pw = ?";
		PreparedStatement ps = con.prepareStatement(sql);

		ps.setString(1, up_nick);
		ps.setString(2, up_email);
		ps.setString(3, up_phone);
		ps.setString(4, id);
		ps.setString(5, pw);
		
		int result = ps.executeUpdate();
		con.close();
		
		if(result > 0) {
			System.out.println("정상 수정 되었습니다.");
		}
		else {
			System.out.println("오류가 생겼습니다.");
		}
	}
}
