package home.beans;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class CoinDao {
	public static final String USERNAME = "kh", PASSWORD = "kh";
	
	// 상품 목록
	public List<CoinDto> list() throws Exception{
		Connection con = JdbcUtils.connect(USERNAME, PASSWORD);
		
		String sql = "select * from coin";
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		
		List<CoinDto> coinList = new ArrayList<>();
		while(rs.next()) {
			CoinDto coinDto = new CoinDto();
			coinDto.setCoinNo(rs.getInt("coinNo"));
			coinDto.setCoinName(rs.getString("coinName"));
			coinDto.setCoinAmount(rs.getInt("coinAmount"));
			
			coinList.add(coinDto);
		}
		return coinList;
	}
}
