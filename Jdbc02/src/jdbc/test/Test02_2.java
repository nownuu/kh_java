package jdbc.test;

import jdbc.beans.ProductDao;
import jdbc.beans.ProductDto2;

public class Test02_2 {
	public static void main(String[] args) throws Exception {
		
		// 모듈 생성
		ProductDto2 productDto = new ProductDto2();
		productDto.setName("메로나이슬");
		productDto.setType("주류");
		productDto.setPrice(2500);
		productDto.setMade("2021-10-06");
		productDto.setExpire("2022-10-06");
		
		ProductDao productDao = new ProductDao();
		productDao.insert2(productDto);
		
		System.out.println("끝!");
	}
}
