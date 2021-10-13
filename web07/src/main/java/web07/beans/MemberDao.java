package web07.beans;
import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class MemberDao {
	public static final String USER = "kh", PASSWORD = "kh";
	
	public void join (MemberDto memberDto) throws Exception {
	
		Connection con = JdbcUtils.connect(USER, PASSWORD);
		
		String sql = "insert into member("
				+ "member_id, member_pw, member_nick, "
				+ "member_birth, member_email, member_phone)"
				+ "values(?, ?, ?, to_date(?, 'YYYY-MM-DD'), ?, ?)";
		
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, memberDto.getMemberId());
		ps.setString(2, memberDto.getMemberPw());
		ps.setString(3, memberDto.getMemberNick());
		ps.setString(4, memberDto.getMemberBirth());
		ps.setString(5, memberDto.getMemberEmail());
		ps.setString(6, memberDto.getMemberPhone());
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
			ps.setString(1, memberDto.getMemberNick());
			ps.setString(2, memberDto.getMemberBirth());
			ps.setString(3, memberDto.getMemberEmail());
			ps.setString(4, memberDto.getMemberPhone());
			ps.setString(5, memberDto.getMemberId());
			ps.setString(6, memberDto.getMemberPw());
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
			ps.setString(2, memberDto.getMemberId());
			ps.setString(3, memberDto.getMemberPw());
			
			int result = ps.executeUpdate();

			return result > 0;
			}
/////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////
		public boolean delete(String memberId) throws Exception {
			Connection con = JdbcUtils.connect(USER, PASSWORD);
			
			String sql = "delete member where member_id = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, memberId);
			int result = ps.executeUpdate();
			
			con.close();
			
			return result > 0;
		}
/////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////
		public List<MemberDto> select() throws Exception{
			Connection con = JdbcUtils.connect(USER, PASSWORD);
			
			String sql = "select * from member";
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			
			List<MemberDto> list = new ArrayList<>();
			
			while(rs.next()) {
				MemberDto memberDto = new MemberDto();
				memberDto.setMemberId(rs.getString("member_id"));
				memberDto.setMemberPw(rs.getString("member_pw"));
				memberDto.setMemberNick(rs.getString("member_nick"));			
				memberDto.setMemberBirth(rs.getString("member_birth"));
				memberDto.setMemberEmail(rs.getString("member_email"));
				memberDto.setMemberPhone(rs.getString("member_phone"));
				memberDto.setMemberJoin(rs.getDate("member_join"));
				memberDto.setMemberPoint(rs.getInt("member_point"));
				memberDto.setMemberGrade(rs.getString("member_grade"));
				
				list.add(memberDto);
			}
			
			con.close();
			
			return list;
		}
/////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////
		public List<MemberDto> select(String column, String keyword) throws Exception{
			Connection con = JdbcUtils.connect(USER, PASSWORD);
			
			String sql = "select * from member where instr(#1, ?) > 0 "
									+ "order by #1 asc";
			sql.replace("#1", column);
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, keyword);
			ResultSet rs = ps.executeQuery();
			
			List<MemberDto> list = new ArrayList<>();
			
			while(rs.next()) {
				MemberDto memberDto = new MemberDto();
				memberDto.setMemberId(rs.getString("member_id"));
				memberDto.setMemberPw(rs.getString("member_pw"));
				memberDto.setMemberNick(rs.getString("member_nick"));			
				memberDto.setMemberBirth(rs.getString("member_birth"));
				memberDto.setMemberEmail(rs.getString("member_email"));
				memberDto.setMemberPhone(rs.getString("member_phone"));
				memberDto.setMemberJoin(rs.getDate("member_join"));
				memberDto.setMemberPoint(rs.getInt("member_point"));
				memberDto.setMemberGrade(rs.getString("member_grade"));
				
				list.add(memberDto);
			}
			
			con.close();
			
			return list;
		}
/////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////
//		목록 조회 기능
		public List<MemberDto> list() throws Exception {
			
			Connection con = JdbcUtils.connect(USER, PASSWORD);
			
			String sql = "select * from member";
			PreparedStatement ps = con.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
			
			//rs의 내용을 List에 복사
			List<MemberDto> memberList = new ArrayList<>();
			while(rs.next()) {
				MemberDto memberDto = new MemberDto();
				
				//(9개 항목 복사)
				memberDto.setMemberId(rs.getString("member_id"));
				memberDto.setMemberPw(rs.getString("member_pw"));
				memberDto.setMemberNick(rs.getString("member_nick"));
				memberDto.setMemberBirth(rs.getString("member_birth"));
				memberDto.setMemberEmail(rs.getString("member_email"));
				memberDto.setMemberPhone(rs.getString("member_phone"));
				memberDto.setMemberJoin(rs.getDate("member_join"));
				memberDto.setMemberPoint(rs.getInt("member_point"));
				memberDto.setMemberGrade(rs.getString("member_grade"));
				
				memberList.add(memberDto);
			}
			
			con.close();
			
			return memberList;
		}
/////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////
//		회원검색 기능
		public List<MemberDto> search(String column, String keyword) throws Exception {
			Connection con = JdbcUtils.connect(USER, PASSWORD);
			
			String sql = "select * from member where instr(#1, ?) > 0 order by #1 asc";
			sql = sql.replace("#1", column);//정적 치환
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, keyword);//동적 치환
			ResultSet rs = ps.executeQuery();
			
			//copy
			List<MemberDto> list = new ArrayList<>();
			while(rs.next()) {
				MemberDto memberDto = new MemberDto();
				
				memberDto.setMemberId(rs.getString("member_id"));
				memberDto.setMemberPw(rs.getString("member_pw"));
				memberDto.setMemberNick(rs.getString("member_nick"));
				memberDto.setMemberBirth(rs.getString("member_birth"));
				memberDto.setMemberEmail(rs.getString("member_email"));
				memberDto.setMemberPhone(rs.getString("member_phone"));
				memberDto.setMemberJoin(rs.getDate("member_join"));
				memberDto.setMemberPoint(rs.getInt("member_point"));
				memberDto.setMemberGrade(rs.getString("member_grade"));
				
				list.add(memberDto);
			}
			
			con.close();
			
			return list;
		}
/////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////
		public MemberDto select(String Member_id) throws Exception {
			Connection con = JdbcUtils.connect(USER, PASSWORD);
			
			String sql = "select * from member where member_id = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, Member_id);
			ResultSet rs = ps.executeQuery();
			
			MemberDto memberDto;
			if(rs.next()) {
				memberDto = new MemberDto();
				
				memberDto.setMemberId(rs.getString("member_id"));
				memberDto.setMemberNick(rs.getString("member_nick"));
				memberDto.setMemberBirth(rs.getString("member_birth"));
				memberDto.setMemberEmail(rs.getString("member_email"));
				memberDto.setMemberPhone(rs.getString("member_phone"));
				memberDto.setMemberJoin(rs.getDate("member_join"));
				memberDto.setMemberPoint(rs.getInt("member_point"));
				memberDto.setMemberGrade(rs.getString("member_grade"));
			}
			else {
				memberDto = null;
			}
			con.close();
			return memberDto;
		}
/////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////
//		회원상세 기능
		public MemberDto get(String memberId) throws Exception {
			Connection con = JdbcUtils.connect(USER, PASSWORD);
			
			String sql = "select * from member where member_id = ?";
			PreparedStatement ps = con.prepareStatement(sql);
			ps.setString(1, memberId);
			ResultSet rs = ps.executeQuery();
			
			MemberDto memberDto;
			
			if(rs.next()) {
				memberDto = new MemberDto();
				
				//copy
				memberDto.setMemberId(rs.getString("member_id"));
				memberDto.setMemberPw(rs.getString("member_pw"));
				memberDto.setMemberNick(rs.getString("member_nick"));
				memberDto.setMemberBirth(rs.getString("member_birth"));
				memberDto.setMemberEmail(rs.getString("member_email"));
				memberDto.setMemberPhone(rs.getString("member_phone"));
				memberDto.setMemberJoin(rs.getDate("member_join"));
				memberDto.setMemberPoint(rs.getInt("member_point"));
				memberDto.setMemberGrade(rs.getString("member_grade"));
			}
			else {
				memberDto = null;
			}
			
			con.close();
			
			return memberDto;
		}
/////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////
		// 포인트 증가 혹은 감소(Update)
		// 등급 변경 가능 - update2]]
		public boolean editPassword(MemberDto memberDto, String changePw) {
			// TODO Auto-generated method stub
			return false;
		}
		public boolean quit(String memberId) {
			// TODO Auto-generated method stub
			return false;
		}
		public boolean edit(MemberDto memberDto) {
			// TODO Auto-generated method stub
			return false;
		}
}
