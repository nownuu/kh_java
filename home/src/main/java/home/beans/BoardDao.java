package home.beans;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class BoardDao {
	public static final String USERNAME = "kh", PASSWORD = "kh";
	
	public List<BoardDto> search(String column, String keyword) throws Exception{
		Connection con = JdbcUtils.connect(USERNAME, PASSWORD);
		String sql = "select * from board where instr(#1, ?) > 0 order by #1 a"
				+ "sc";
		sql = sql.replace("#1", column);
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, keyword);
		ResultSet rs = ps.executeQuery();
		
		List<BoardDto> list = new ArrayList<>();
		while(rs.next()) {
			BoardDto boardDto = new BoardDto();
			boardDto.setBoardNo(rs.getInt("board_no"));
			boardDto.setBoardWriter(rs.getString("board_writer"));
			boardDto.setBoardTitle(rs.getString("board_title"));
			boardDto.setBoardContent(rs.getString("board_content"));
			boardDto.setBoardTime(rs.getDate("board_time"));
			boardDto.setBoardRead(rs.getInt("board_read"));
			boardDto.setBoardReply(rs.getInt("board_reply"));
			boardDto.setBoardSuperNo(rs.getInt("board_superno"));
			boardDto.setBoardGroupNo(rs.getInt("board_groupno"));
			boardDto.setBoardDepth(rs.getInt("board_depth"));
			
			list.add(boardDto);
		}
		con.close();
		
		return list;
	}
	
	public List<BoardDto> list() throws Exception{
		Connection con = JdbcUtils.connect(USERNAME, PASSWORD);
		
		String sql = "select * from board order by board_no desc"; //최신순
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		
		List<BoardDto> boardList	= new ArrayList<>();
		while(rs.next()) {
			BoardDto boardDto = new BoardDto();
			
			boardDto.setBoardNo(rs.getInt("board_no"));
			boardDto.setBoardWriter(rs.getString("board_writer"));
			boardDto.setBoardTitle(rs.getString("board_title"));
			boardDto.setBoardContent(rs.getString("board_content"));
			boardDto.setBoardTime(rs.getDate("board_time"));
			boardDto.setBoardRead(rs.getInt("board_read"));
			boardDto.setBoardReply(rs.getInt("board_reply"));
			boardDto.setBoardSuperNo(rs.getInt("board_superno"));
			boardDto.setBoardGroupNo(rs.getInt("board_groupno"));
			boardDto.setBoardDepth(rs.getInt("board_depth"));
			
			boardList.add(boardDto);
		}
		con.close();
		
		return boardList;
	}
	
	public BoardDto get(int boardNo) throws Exception{
		Connection con = JdbcUtils.connect(USERNAME, PASSWORD);
		
		String sql = "select * from board where board_no = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, boardNo);
		ResultSet rs = ps.executeQuery();
		
		BoardDto boardDto;
		
		if(rs.next()) {
			boardDto = new BoardDto();
			
			boardDto.setBoardNo(rs.getInt("board_no"));
			boardDto.setBoardTitle(rs.getString("board_title"));
			boardDto.setBoardWriter(rs.getString("board_writer"));
			boardDto.setBoardTime(rs.getDate("board_time"));
			boardDto.setBoardRead(rs.getInt("board_read"));
		}
		else {
			boardDto = null;
		}
		con.close();
		return boardDto;
	}
	// 글 쓰기 1
	public void write(BoardDto boardDto) throws Exception {
		Connection con = JdbcUtils.connect(USERNAME, PASSWORD);
		
		String sql = "insert into board values(board_seq.nextval, ?, ?, ?, sysdate, 0, 0, 0, 0, 0)";
		PreparedStatement ps = con.prepareStatement(sql);
		
		ps.setString(1, boardDto.getBoardWriter());
		ps.setString(2, boardDto.getBoardTitle());
		ps.setString(3, boardDto.getBoardContent());
		ps.execute();
		
		con.close();
	}
	//조회수 증가 기능
	public boolean readUp(int boardNo, String memberId) throws Exception{
		Connection con = JdbcUtils.connect(USERNAME, PASSWORD);
		
		String sql ="update board set board_read = board_read+1 where board_no=? and board_writer != ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, boardNo);
		ps.setString(2, memberId);
		int result = ps.executeUpdate();
		
		con.close();
		return result > 0;
	}
	
	// 번호 생성 기능 : 번호를 미리 생성해두어야 할 필요가 있는 경우 사용
	public int getSequence() throws Exception{
		Connection con = JdbcUtils.connect(USERNAME, PASSWORD);
		
		String sql = "select board_seq.nextval from dual";
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		
		rs.next();
		int seq = rs.getInt("nextval");
//		int seq = rs.getInt(1);
		
		con.close();
		return seq;
	}
	
	// 글쓰기 2 - 번호를 알아내면서 등록하는 방법
	public void write2(BoardDto boardDto) throws Exception {
		Connection con = JdbcUtils.connect(USERNAME, PASSWORD);
		
		String sql = "insert into board values(?, ?, ?, ?, sysdate, 0, 0, 0, 0, 0)";
		PreparedStatement ps = con.prepareStatement(sql);
		
		ps.setInt(1, boardDto.getBoardNo());
		ps.setString(1, boardDto.getBoardWriter());
		ps.setString(2, boardDto.getBoardTitle());
		ps.setString(3, boardDto.getBoardContent());
		ps.execute();
		
		con.close();
	}
	
	// 삭제
	public boolean delete(int boardNo) throws Exception{
		Connection con = JdbcUtils.connect(USERNAME, PASSWORD);
		
		String sql = "delete board where board_no =?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, boardNo);
		int result = ps.executeUpdate();
		
		con.close();
		
		return result > 0;
	}
	// 수정
	public boolean edit(BoardDto boardDto) throws Exception{
		Connection con = JdbcUtils.connect(USERNAME, PASSWORD);
		
		String sql = "update board set board_title=?, board_content=? where board_no=?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, boardDto.getBoardTitle());
		ps.setString(2, boardDto.getBoardContent());
		ps.setInt(3, boardDto.getBoardNo());
		
		int result = ps.executeUpdate();
		
		con.close();
		
		return result > 0;
		
	}
}
