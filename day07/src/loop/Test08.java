package loop;

public class Test08 {
	public static void main(String[] args) {
		
		for(int i = 1 ; i <=100 ; i++) {
			if(i%5==0 && i%10!=0 || i>=50 && i<60) {
				System.out.println("5가 들어간  = "+ i);
			}
		}
	}
}
