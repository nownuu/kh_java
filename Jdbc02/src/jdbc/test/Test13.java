package jdbc.test;

import java.util.List;

import jdbc.beans.ProductDao;
import jdbc.beans.ProductDto;

public class Test13 {
	public static void main(String[] args) throws Exception {
		
		ProductDao productDao = new ProductDao();
		List<ProductDto> list = productDao.select();
		
		System.out.println("개수 = "+list.size());
		for(ProductDto productDto : list) {
			System.out.print(productDto.getNo());
			System.out.print(" / ");
			System.out.print(productDto.getName());
			System.out.print(" / ");
			System.out.print(productDto.getType());
			System.out.print(" / ");
			System.out.print(productDto.getPrice());
			System.out.print(" / ");
			System.out.print(productDto.getMade());
			System.out.print(" / ");
			System.out.print(productDto.getExpire());
		}
	}
}
