package jdbc.update;

import java.util.Scanner;

import jdbc.beans.ProductDao;
import jdbc.beans.ProductDto;


public class Test05 {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		System.out.println("변경하려는 제품의 정보를 입력하십시오");
		ProductDto productDto = new ProductDto();
		System.out.print("상품 번호 = ");
		productDto.setNo(sc.nextInt());
		productDto.setName("상품명 = "+sc.nextLine());
		productDto.setType("상품 타입 = " +sc.nextLine());
		System.out.print("상품 가격 = ");
		productDto.setPrice(sc.nextInt());
		productDto.setMade("제조일자 = " +sc.nextLine());
		productDto.setExpire("유통기한 = " +sc.nextLine());
		
		ProductDao productDao = new ProductDao();
		boolean isSuccess = productDao.update(productDto);
		
		if(isSuccess) {
			System.out.println("변경이 완료되었습니다.");
		}
		else {
			System.out.println("해당 번호의 정보가 없습니다.");
		}
	}
}
