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
/////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////
		public boolean update(MemberDto memberDto) throws Exception {
			Connection con = JdbcUtils.connect(USER, PASSWORD);
			
			String sql = "update set member_nick = ? , "
					+ "member_birth = to_date(?, 'yyyy-MM-dd'),"
					+ "member_email = ?, member_phone = ?"
					+ "where member_id = ? and member_pw = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, memberDto.getNick());
			ps.setDate(2, memberDto.getBirth());
			ps.setString(3, memberDto.getEmail());
			ps.setString(4, memberDto.getPhone());
			ps.setString(5, memberDto.getId());
			ps.setString(6, memberDto.getPassword());
			int result = ps.executeUpdate();
			
			return result > 0;
		}
/////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////
		public boolean updatePW(MemberDto memberDto, String changePW) throws Exception {
			Connection con = JdbcUtils.connect(USER, PASSWORD);

			String sql = "update set member_pw = ?,"
			+ "where member_id = ? and member_pw = ? ";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, changePW);
			ps.setString(2, memberDto.getId());
			ps.setString(3, memberDto.getPassword());
			
			int result = ps.executeUpdate();

			return result > 0;
			}
}
