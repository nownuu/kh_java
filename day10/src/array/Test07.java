package array;

public class Test07 {
	public static void main(String[] args) {
		
		int[] a = new int[3];
		
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		
		for(int i = 0 ; i < a.length ; i ++) {
			System.out.println(a[i]);
		}
		
		int[] b = new int[] {10,20,30};
		System.out.println("length = " + b.length);
		
		for(int i = 0 ; i < b.length; i++) {
			System.out.println(b[i]);
		}
	}
}
