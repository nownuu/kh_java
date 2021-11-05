package jdbc.test;

import java.util.List;
import java.util.Scanner;

import jdbc.beans.ProductDao;
import jdbc.beans.ProductDto;

public class Test17 {
	public static void main(String[] args) throws Exception {
		// 입력
		Scanner sc = new Scanner(System.in);
		System.out.println("IN PUT COLUMN");
		String column = sc.nextLine();
		System.out.println("IN PUT KEYWORD");
		String keyword = sc.nextLine();
		sc.close();
		
		ProductDao productDao = new ProductDao();
		List<ProductDto> list = productDao.select(column, keyword);
		
		System.out.println("개수 = "+list.size());
		for(ProductDto productDto : list) {
			System.out.print("\n"+productDto.getNo());
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
