package jdbc.select2;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import jdbc.util.JdbcUtils;

public class Test04 {
	public static void main(String[] args) throws Exception {
		//입력
		Scanner sc = new Scanner(System.in);
		System.out.println("Input Your ID");
		String id = sc.next();
		System.out.println("Input Your PassWord");
		String pw = sc.next();
		sc.close();
		
		// 조회
		Connection con = JdbcUtils.connect("kh", "kh");
		System.out.println("Oracle Login");
		
		String sql = "select * from member where member_id = ? and member_pw = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, id);
		ps.setString(2, pw);
		ResultSet rs = ps.executeQuery();
		
		if(rs.next()) {
			System.out.println(id+"님 로그인 성공");
		}
		else {
			System.out.println("로그인 정보가 일치하지 않습니다.");
		}
		con.close();
	}
}
