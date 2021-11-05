package loop;

public class Test15 {
	public static void main(String[] args) {
	
		int num = 12752137;
		
		int count = 0;
		for(int i = num ; i > 0  ; i /=10) {
			int n = i%10;
				//System.out.println( n );
				
				if(n == 7) {
					count ++ ;
				}
		}
		System.out.println("7은 총 "+ count +"개 있습니다.");
	}
}