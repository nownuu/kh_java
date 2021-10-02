package review_1;

import java.util.Random;

public class RW_1 {
	public static void main(String[] args) {
		// 로또 6개 추첨기
		
		
		Random r = new Random();
		int[] count = new int[45];
		
		System.out.println("로또를 추첨합니다.");
		System.out.println("=========================");
		
		for(int i = 0; i < 1000; i++) {
			int lotto = r.nextInt(45)+1;
			count[lotto-1]++;
		}
		
		for(int i = 0 ; i < 6 ; i ++) {
			System.out.print(count[i]+"번 ");
		}
	}
}
