package random;

import java.util.Random;

public class Test06 {
	public static void main(String[] args) {
		
		//이번주 로또번호를 추첨한 결과를 배열에 저장하세요.
		
	
		Random r = new Random();
		int count = 0;
		int[] lotto = new int[6];
		
		while (true) {
			int nonum = r.nextInt(45);
			boolean sel = false;
			for(int i = 0 ; i < lotto.length ; i++) {
				if(lotto[i] == nonum ) {
					sel = true;
				}
			}
			if(sel == false) {
				lotto[count] = nonum;
				count++;
			}
			if ( count == 6) {
				break;
			}
		}
		for(int i = 0 ; i < lotto.length ; i++) {
			System.out.println(lotto[i]);
		}
	}
}
