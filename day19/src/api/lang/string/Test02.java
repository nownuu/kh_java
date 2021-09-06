package api.lang.string;

public class Test02 {
	public static void main(String[] args) {
		
		String id = new String("admin");
		String pw = new String("master");
		
		if(id.equalsIgnoreCase("admin") && pw.equalsIgnoreCase("master")) {
			System.out.println("관리자 로그인되었습니다.");
		}
		else {
			System.out.println("정보가 일치하지 않습니다.");
		}
	}
}
