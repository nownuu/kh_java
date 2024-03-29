package home.beans;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class BoardDao {
	
	//목록기능
	public List<BoardDto> list() throws Exception {
		Connection con = JdbcUtils.connect2();
		
		String sql = "select * from board order by board_no desc";//최신순
		PreparedStatement ps = con.prepareStatement(sql);
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
	
	//검색기능
	public List<BoardDto> search(String column, String keyword) throws Exception {
		Connection con = JdbcUtils.connect2();
		
		String sql = "select * from board where instr(#1, ?) > 0 order by board_no desc";
		sql = sql.replace("#1", column);//정적 바인딩
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
	
	//상세보기 기능
	public BoardDto get(int boardNo) throws Exception {
		Connection con = JdbcUtils.connect2();
		
		String sql = "select * from board where board_no = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, boardNo);
		ResultSet rs = ps.executeQuery();
		
		BoardDto boardDto;
		if(rs.next()) {
			boardDto = new BoardDto();
			
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
		}
		else {
			boardDto = null;
		}
		
		con.close();
		
		return boardDto;
	}
	
	//조회수 증가 기능
	public boolean readUp(int boardNo) throws Exception {
		Connection con = JdbcUtils.connect2();
		
		String sql = "update board set board_read = board_read + 1 where board_no = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, boardNo);
		int result = ps.executeUpdate();
		
		con.close();
		
		return result > 0;
	}
	
	//남의 글일 경우에만 조회수를 증가하는 기능
	public boolean readUp(int boardNo, String memberId) throws Exception {
		Connection con = JdbcUtils.connect2();
		
		String sql = "update board "
							+ "set board_read = board_read + 1 "
							+ "where board_no = ? and board_writer != ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, boardNo);
		ps.setString(2, memberId);
		int result = ps.executeUpdate();
		
		con.close();
		
		return result > 0;
	}

	//등록 기능
	public void write(BoardDto boardDto) throws Exception{
		Connection con = JdbcUtils.connect2();
		
		String sql = "insert into board values(board_seq.nextval, ?, ?, ?, sysdate, 0, 0, null, 0, 0)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, boardDto.getBoardWriter());
		ps.setString(2, boardDto.getBoardTitle());
		ps.setString(3, boardDto.getBoardContent());
		ps.execute();
		
		con.close();
	}
	
	//번호 생성 기능 : 번호를 미리 생성해두어야 할 필요가 있는 경우 사용
	public int getSequence() throws Exception {
		Connection con = JdbcUtils.connect2();
		
		String sql = "select board_seq.nextval from dual";
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs= ps.executeQuery();
		
		rs.next();
		//int seq = rs.getInt("nextval");
		int seq = rs.getInt(1);
		
		con.close();
		
		return seq;
	}
	
	//등록 기능2 : 번호를 미리 생성해놓은 경우의 추가 기능
	public void write2(BoardDto boardDto) throws Exception{
		Connection con = JdbcUtils.connect2();
		
		String sql = "insert into board values(?, ?, ?, ?, sysdate, 0, 0, null, ?, 0)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, boardDto.getBoardNo());
		ps.setString(2, boardDto.getBoardWriter());
		ps.setString(3, boardDto.getBoardTitle());
		ps.setString(4, boardDto.getBoardContent());
		ps.setInt(5, boardDto.getBoardNo());
		ps.execute();
		
		con.close();
	}

	//삭제 기능
	public boolean delete(int boardNo) throws Exception{
		Connection con = JdbcUtils.connect2();
		
		String sql = "delete board where board_no = ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, boardNo);
		int result = ps.executeUpdate();
		
		con.close();
		
		return result > 0;
	}

	//수정 기능
	public boolean edit(BoardDto boardDto) throws Exception {
		Connection con = JdbcUtils.connect2();
		
		String sql = "update board set board_title=?, board_content=? where board_no=?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, boardDto.getBoardTitle());
		ps.setString(2, boardDto.getBoardContent());
		ps.setInt(3, boardDto.getBoardNo());
		int result = ps.executeUpdate();
		
		con.close();
		
		return result > 0;
	}
	
	//페이징 목록
	public List<BoardDto> listByRownum(int begin, int end) throws Exception {
		Connection con = JdbcUtils.connect2();
		
		String sql = "select * from ("
								+ "select rownum rn, TMP.* from ("
									+ "select * from board order by board_no desc"
								+ ")TMP"
						+ ") where rn between ? and ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, begin);
		ps.setInt(2, end);
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
	
	//페이징 검색
	public List<BoardDto> searchByRownum(String column, String keyword, int begin, int end) throws Exception {
		Connection con = JdbcUtils.connect2();
		
		String sql = "select * from ("
								+ "select rownum rn, TMP.* from ("
									+ "select * from board where instr(#1, ?) > 0 order by board_no desc"
								+ ")TMP"
						+ ") where rn between ? and ?";
		sql = sql.replace("#1", column);
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, keyword);
		ps.setInt(2, begin);
		ps.setInt(3, end);
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
	
	//페이징에서 마지막 블록을 구하기 위하여 게시글 개수를 구하는 기능(목록 / 검색)
	public int count() throws Exception {
		Connection con = JdbcUtils.connect2();
		
		String sql = "select count(*) from board";
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		
		rs.next();
		
//		int count = rs.getInt("count(*)");
		int count = rs.getInt(1);
		
		con.close();
		
		return count;
	}
	
	public int count(String column, String keyword) throws Exception {
		Connection con = JdbcUtils.connect2();
		
		String sql = "select count(*) from board where instr(#1, ?) > 0";
		sql = sql.replace("#1", column);
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, keyword);
		ResultSet rs = ps.executeQuery();
		
		rs.next();
		
//		int count = rs.getInt("count(*)");
		int count = rs.getInt(1);
		
		con.close();
		
		return count;
	}

	//댓글 개수 갱신 기능
	public boolean refreshReplyCount(int boardNo) throws Exception{
		Connection con = JdbcUtils.connect2();

		String sql = "update board "
							+ "set board_reply=(select count(*) from reply where board_no=?) "
							+ "where board_no=?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, boardNo);
		ps.setInt(2, boardNo);
		int result = ps.executeUpdate();
		
		con.close();
		
		return result > 0;
	}
	
	//계층형 목록(Tree)
	public List<BoardDto> listByTreeSort(int begin, int end) throws Exception {
		Connection con = JdbcUtils.connect2();
		
		String sql = "select * from ("
								+ "select rownum rn, TMP.* from ("
									+ "select * from board "
									+ "connect by prior board_no = board_superno "
									+ "start with board_superno is null "
									+ "order siblings by board_groupno desc, board_no asc"
								+ ")TMP"
						+ ") where rn between ? and ?";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, begin);
		ps.setInt(2, end);
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

	
	public void writeAnswer(BoardDto boardDto) throws Exception{
		Connection con = JdbcUtils.connect2();
		
		String sql = "insert into board values(?, ?, ?, ?, sysdate, 0, 0, ?, ?, ?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, boardDto.getBoardNo());
		ps.setString(2, boardDto.getBoardWriter());
		ps.setString(3, boardDto.getBoardTitle());
		ps.setString(4, boardDto.getBoardContent());
		ps.setInt(5, boardDto.getBoardSuperNo());//계산된 상위글번호
		ps.setInt(6, boardDto.getBoardGroupNo());//계산된 그룹번호(원본글 그룹번호와 동일)
		ps.setInt(7, boardDto.getBoardDepth());//계산된 차수(원본글 차수 + 1)
		ps.execute();
		
		con.close();
	}
}