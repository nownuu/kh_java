package jdbc.insert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Test02_1 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String user = "kh";
		String password = "kh";
		
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection(url, user, password);
	
		Scanner sc = new Scanner(System.in);
		System.out.println("메뉴 이름 : ");
		String menuName = sc.nextLine();
		System.out.println("메뉴 가격");
		int menuPrice = sc.nextInt();
		System.out.println("메뉴 유형 : ");
		String menuType = sc.nextLine();
		sc.close();
	
		String sql = "insert into menu(menu_name, menu_price, menu_type) "
								+ "values('"+menuName +"', '"+menuPrice +"', '"+menuType+"')";
		
		
		PreparedStatement ps = con.prepareStatement(sql);
		
		//3. 실행
		ps.execute();		
		
		con.close();
		System.out.println("실행 완료");
	}
}
