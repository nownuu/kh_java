package home.beans;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class BoardFileDao {

	public void insert(BoardFileDto boardFileDto) throws Exception {
		Connection con = JdbcUtils.connect2();
		
		String sql = "insert into board_file values(board_file_seq.nextval, ?, ?, ?, ?, ?)";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setInt(1, boardFileDto.getBoardNo());
		ps.setString(2, boardFileDto.getBoardFileUploadname());
		ps.setString(3, boardFileDto.getBoardFileSavename());
		ps.setLong(4, boardFileDto.getBoardFileSize());
		ps.setString(5, boardFileDto.getBoardFileType());
		ps.execute();
		con.close();
	}
}
