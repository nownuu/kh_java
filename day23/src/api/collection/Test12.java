package api.collection;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Test12 {
	public static void main(String[] args) {
		List<Product> list= new ArrayList<>();
		
		list.add(new Product("아카시아","껌",500,40));
		list.add(new Product("전주비빔","삼각김밥",1200,5));
		list.add(new Product("제육도시락","도시락",4000,3));
		list.add(new Product("육개장큰사발","라면",1500,25));
		list.add(new Product("판타롱스타킹","양말",1000,20));
		
		Scanner sc = new Scanner(System.in);

		int total = 0;
		while(true) {
			System.out.print("판매할 상품명을 입력하세요");
			String name = sc.nextLine();
			
			if(name.equals("종료")) {
				System.out.println("프로그램을 종료합니다");
				break;
			}
			else{
				Product p = new Product(name);
				int index = list.indexOf(p);
				
				if(index>=0) {
					Product find = list.get(index);
					if(find.getStock()==0) {
						System.out.println("재고가 부족합니다.");
					}
					else {
						find.sold(); 
						System.out.println("["+find.getName()+ "] 판매 완료되었습니다");
						total+=find.getPrice();
					}
				}
			
				else {
					System.out.println("존재하지 않는 상품입니다");
				}
			}
		}
		
		System.out.println("[ 일 매출 : " + total + "원 ]" +"상품 재고관리");
		for (Product p : list) {
			System.out.println(p);
	  	}
	  }
	}