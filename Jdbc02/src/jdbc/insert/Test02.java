package jdbc.insert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Test02 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "kh";
		String password = "kh";
		
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection(url, user, password);
	
		
		String menuName = "오므라이스";
		String menuType = "식사";
		int menuPrice = 8500;
	
		String sql = "insert into menu(menu_name, menu_price, menu_type) "
								+ "values('"+menuName +"', '"+menuPrice +"', '"+menuType+"')";
		
		
		PreparedStatement ps = con.prepareStatement(sql);
		
		//3. 실행
		ps.execute();		
		
		con.close();
		System.out.println("실행 완료");
	}
}
