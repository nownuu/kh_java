package jdbc.test;

import jdbc.beans.ProductDao;
import jdbc.beans.ProductDto;

public class Test02_1 {
	public static void main(String[] args) throws Exception {
		
		// 모듈 생성
		ProductDto productDto = new ProductDto();
		productDto.getName();
		productDto.getType();
		productDto.getPrice();
		productDto.getMade();
		productDto.getExpire();
		
		ProductDao productDao = new ProductDao();
		productDao.insert(productDto);
		System.out.println("Insert FINISH");
	}
}
