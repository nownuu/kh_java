package loop;

public class Test11 {
	public static void main(String[] args) {
		
		int count = 0;
		
		for(int i = 1 ; i <= 100 ; i++) {
			if(i%5==0 && i%10!=0 || i>=50 && i<60) {
				System.out.println("i = "+i);
				count ++;
			}
		}
		System.out.println(count);
	}

}
