package api.collection3;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		
		Map<String, String> login	= new HashMap<>();
		
		login.put("testuser", "testuser1234");
		login.put("student", "student1234");
		login.put("manager", "manager1234");
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("아이디를 입력하십시오");
			String ID = sc.next();
			System.out.println("비밀번호를 입력하십시오");
			String password = sc.next();
			sc.close();
			
			String trueword = login.get(ID);
			if(password.equals(trueword)) {
				System.out.println("로그인 성공");
			}
			else {
				System.out.println("정보가 일치하지 않습니다.");
			}
			break;
		}
		
	}
}
