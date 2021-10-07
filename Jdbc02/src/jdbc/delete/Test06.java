package jdbc.delete;

import java.util.Scanner;

import jdbc.beans.ProductDao;
import jdbc.beans.ProductDto;

public class Test06 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("변경하려는 제품의 정보를 입력하십시오");
		ProductDto productDto = new ProductDto();
		System.out.print("상품 번호 = ");
		productDto.setNo(sc.nextInt());
		System.out.print("상품 가격 = ");
		productDto.setPrice(sc.nextInt());
		
		ProductDao productDao = new ProductDao();
		boolean isSuccess = productDao.updatePrice(productDto);
		
		if(isSuccess) {
			System.out.println("변경이 완료되었습니다.");
		}
		else {
			System.out.println("해당 번호의 정보가 없습니다.");
		}
	}
}
