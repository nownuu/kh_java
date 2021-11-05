package jdbc.test;

import java.util.Scanner;

import jdbc.beans.ProductDao;

public class Test10 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("삭제할 번호를 입력하십시오");
		int number = sc.nextInt();
		
		ProductDao productDao = new ProductDao();
		boolean success = productDao.delete(number);
		
		if(success) {
			System.out.println("삭제 완료");
		}
		else {
			System.out.println("존재하지 않는 번호");
		}
	}
}
