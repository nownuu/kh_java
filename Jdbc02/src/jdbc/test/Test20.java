package jdbc.test;

import java.util.Scanner;

import jdbc.beans.ProductDao;
import jdbc.beans.ProductDto;

public class Test20 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("상품 코드를 입럭하십시오");
		int number = sc.nextInt();
		sc.close();
		
		ProductDao productDao = new ProductDao();
		ProductDto productDto = productDao.select(number);
		
		if(productDto == null) {
			System.out.println("해당 상품은 존재하지 않습니다.");
		}
		else {
			System.out.println(productDto);
		}
	}
}
