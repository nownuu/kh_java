package jdbc.beans;

import java.sql.Connection;
import java.sql.PreparedStatement;

import jdbc.util.JdbcUtils;

public class MemberDao {
	public static final String USER = "kh", PASSWORD = "kh";
	
	public void join (MemberDto memberDto) throws Exception {
	
		Connection con = JdbcUtils.connect(USER, PASSWORD);
		
		String sql = "insert into member("
				+ "member_id, member_pw, member_nick, "
				+ "member_birth, member_email, member_phone)"
				+ "values(?, ?, ?, to_date(?, 'YYYY-MM-DD'), ?, ?)";
		
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, memberDto.getId());
		ps.setString(2, memberDto.getPassword());
		ps.setString(3, memberDto.getNick());
		ps.setDate(4, memberDto.getBirth());
		ps.setString(5, memberDto.getEmail());
		ps.setString(6, memberDto.getPhone());
		ps.execute();
		
		con.close();
	}
}
