package loop;

public class Test12 {
	public static void main(String[] args) {
		
		int count = 0;
		int total = 0;
		
		for(int i = 1 ; i <=30 ; i ++) {
			if( i == 1) {
				count = 10;
				System.out.println(i+ "일에 하게 되는 푸시업 개수 = "+ count);
			}
			else {
			count +=3;
			System.out.println(i+ "일에 하게 되는 푸시업 개수 = "+ count);
			}
			total += count;
		}
		System.out.println("30일간 하게 되는 푸시업 개수 = " + total);
	}	
}
