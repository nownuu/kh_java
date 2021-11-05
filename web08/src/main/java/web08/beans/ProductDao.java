package web08.beans;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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
/////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////
			public boolean delete(int productNo) throws Exception {
				Connection con = JdbcUtils.connect(USER, PASSWORD);
				
				String sql = "delete product where no = ?";
				PreparedStatement ps = con.prepareStatement(sql);
				ps.setInt(1, productNo);
				int result = ps.executeUpdate();
				
				con.close();
				return result > 0;
			}
/////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////
			public List<ProductDto> select() throws Exception{
				Connection con = JdbcUtils.connect(USER, PASSWORD);
				
				String sql = "select * from Product";
				PreparedStatement ps = con.prepareStatement(sql);
				ResultSet rs = ps.executeQuery();
				
				List<ProductDto> list = new ArrayList<>();
				
				while(rs.next()) {
					ProductDto productDto = new ProductDto();
					productDto.setNo(rs.getInt("no"));
					productDto.setName(rs.getString("Name"));
					productDto.setType(rs.getString("type"));
					productDto.setPrice(rs.getInt("price"));
					productDto.setMade(rs.getString("made"));
					productDto.setExpire(rs.getString("expire"));
					
					list.add(productDto);
				}
				con.close();
				
				return list;
			}
/////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////
			public List<ProductDto> select(String column, String keyword) throws Exception{
				Connection con = JdbcUtils.connect(USER, PASSWORD);
				
				String sql = "select * from product where instr(#1, ?) > 0 "
										+ "order by #1 asc";
//			  	String sql = "select * from product where #1 like '%'||?||'%' order by #1 asc";
				
				sql = sql.replace("#1", column);
				PreparedStatement ps = con.prepareStatement(sql);
				ps.setString(1, keyword);
				ResultSet rs = ps.executeQuery();
				
				List<ProductDto> list = new ArrayList<>();
				
				while(rs.next()) {
					ProductDto productDto = new ProductDto();
					productDto.setNo(rs.getInt("no"));
					productDto.setName(rs.getString("Name"));
					productDto.setType(rs.getString("type"));
					productDto.setPrice(rs.getInt("price"));
					productDto.setMade(rs.getString("made"));
					productDto.setExpire(rs.getString("expire"));
					
					list.add(productDto);
				}
				con.close();
				
				return list;
			}
/////////////////////////////////////////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////
			public ProductDto select(int no) throws Exception {
				Connection con = JdbcUtils.connect(USER, PASSWORD);
				
				String sql = "select * from product where no = ?";
				PreparedStatement ps = con.prepareStatement(sql);
				ps.setInt(1, no);
				ResultSet rs = ps.executeQuery();
				
				ProductDto productDto;
				if(rs.next()) {
					productDto = new ProductDto();
					productDto.setNo(rs.getInt("no"));
					productDto.setName(rs.getString("Name"));
					productDto.setType(rs.getString("type"));
					productDto.setPrice(rs.getInt("price"));
					productDto.setMade(rs.getString("made"));
					productDto.setExpire(rs.getString("expire"));
				}
				else {
					productDto = null;
				}
				con.close();
				return productDto;
			}

			public ProductDto select(String name) throws Exception {
				Connection con = JdbcUtils.connect(USER, PASSWORD);
				
				String sql = "select * from product where name = ?";
				PreparedStatement ps = con.prepareStatement(sql);
				ps.setString(1, name);
				ResultSet rs = ps.executeQuery();
				
				ProductDto productDto;
				if(rs.next()) {
					productDto = new ProductDto();
					productDto.setNo(rs.getInt("no"));
					productDto.setName(rs.getString("Name"));
					productDto.setType(rs.getString("type"));
					productDto.setPrice(rs.getInt("price"));
					productDto.setMade(rs.getString("made"));
					productDto.setExpire(rs.getString("expire"));
				}
				else {
					productDto = null;
				}
				con.close();
				return productDto;
			}
}

