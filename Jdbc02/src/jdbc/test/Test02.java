package jdbc.test;

import jdbc.beans.ProductDao;

public class Test02 {
	public static void main(String[] args) throws Exception {
		
		String name = "메로나 술";
		String type = "주류";
		int price = 2500;
		String made = "2021-10-06";
		String expire = "2022-10-06";
		ProductDao productDao = new ProductDao();
		productDao.insert(name, type, price, made, expire);
		
		System.out.println("Insert FINISH");
	}
}
