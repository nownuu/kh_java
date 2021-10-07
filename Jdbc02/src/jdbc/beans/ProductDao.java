package jdbc.beans;

import java.sql.Connection;
import java.sql.PreparedStatement;

import jdbc.util.JdbcUtils;

public class ProductDao {
	public static final String USER = "kh", PASSWORD ="kh";
	public void insert(String name, String type, int Price, String made, String expire) throws Exception {
		Connection con = JdbcUtils.connect(USER, PASSWORD);
		
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
/////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////
	
	public void insert(ProductDto productDto) throws Exception {
		Connection con = JdbcUtils.connect(USER, PASSWORD);
		
		String sql = "insert into product values"
				+ "(product_seq.nextval, ?, ?, ?, "
				+ "to_date(?, 'yyyy-MM-dd'), to_date(?, 'yyyy-MM-dd'))";
		PreparedStatement ps = con.prepareStatement(sql);
		ps.setString(1, productDto.getName());
		ps.setString(2, productDto.getType());
		ps.setInt(3, productDto.getPrice());
		ps.setString(4, productDto.getMade());
		ps.setString(5, productDto.getExpire());
		ps.execute();
		
		con.close();
	}
/////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////
		public void insert2(ProductDto2 productDto) throws Exception {
			Connection con = JdbcUtils.connect(USER, PASSWORD);
					
					String sql = "insert into product("
												+ "no, name, type, price, made, expire"
											+ ") "
											+ "values("
												+ "product_seq.nextval, ?, ?, ?, ?, ?"
											+ ")";
					PreparedStatement ps = con.prepareStatement(sql);
					ps.setString(1, productDto.getName());
					ps.setString(2, productDto.getType());
					ps.setInt(3, productDto.getPrice());
					ps.setDate(4, productDto.getMade());
					ps.setDate(5, productDto.getExpire());
					ps.execute();
					
					con.close();
		}
/////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////
			public boolean update(ProductDto productDto) throws Exception {
				Connection con = JdbcUtils.connect(USER, PASSWORD);
				
				String sql = "update product set name = ?, type = ?, price = ? "
						+ "made = to_date(?, 'yyyy-MM-dd'), expire = to_date(?, 'yyyy-MM-dd') "
						+ "where no = ?";
				PreparedStatement ps = con.prepareStatement(sql);
				ps.setString(1, productDto.getName());
				ps.setString(2, productDto.getType());
				ps.setInt(3, productDto.getPrice());
				ps.setString(4, productDto.getMade());
				ps.setString(5, productDto.getExpire());
				ps.setInt(6, productDto.getNo());
				int result = ps.executeUpdate();
				
				return result > 0;
		}
/////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////
			public boolean updatePrice(ProductDto productDto) throws Exception {
				Connection con = JdbcUtils.connect(USER, PASSWORD);
				
				String sql = "update product set name = ?, type = ?, price = ? made = ?, expire = ? "
						+ "where no = ?";
				PreparedStatement ps = con.prepareStatement(sql);
				ps.setInt(1, productDto.getNo());
				ps.setInt(3, productDto.getPrice());
				int result = ps.executeUpdate();
				
				return result > 0;
			}
}

