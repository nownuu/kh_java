package jdbc.beans;

import java.sql.Connection;
import java.sql.PreparedStatement;
import jdbc.util.JdbcUtils;

public class ProductDao {
	public void insert(String name, String type, int Price, String made, String expire) throws Exception {
		Connection con = JdbcUtils.connect("kh", "kh");
		
		String sql = "insert into product values"
				+ "(product_seq.nextval, ?, ?, ?, "
				+ "to_date(?, 'yyyy-MM-dd'), to_date(?, 'yyyy-MM-dd'))";
		PreparedStatement ps = con.prepareStatement(sql);
		
		ps.setString(1, name);
		ps.setString(2, type);
		ps.setInt(3, Price);
		ps.setString(4,made);
		ps.setString(5, expire);
		ps.execute();
		
		con.close();
	}
}
