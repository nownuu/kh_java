package loop;

public class Test09 {
	public static void main(String[] args) {
		
		for(int i = 1 ; i <=99 ;  i++) {
			int x = i%10;
			int y = i/10;
			
			if(x==3 || x==6 || x==9 || y ==3 || y == 6 || y == 9 ) {
				System.out.println("짝");
			}
			else if((x == 3 || x ==6 ||x ==9)&&(y==3|| y ==6 || y == 9)) {
				System.out.println("짝짝");
			}
				else {
				System.out.println(i);
				}
		}
	}	
}


