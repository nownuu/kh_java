package array;
import java.util.Scanner;
public class Test14 {
	public static void main(String[] args) {
		
		int[] data = new int[] {30, 50, 20, 10, 40};
		
		System.out.println("원본");
		
		for (int i = 0 ; i < data.length ; i++) {
			System.out.println(data[i]);
		}
		
		// 1번 문제
		Scanner sc = new Scanner(System.in);
		System.out.println("원하는 회전 크기 입력");
		int size = sc.nextInt();
		sc.close();
	
			for(int k = 0 ; k < size ; k++) {
					int temp = data[data.length-1];
					for(int i=data.length-1; i > 0; i--) {
								data[i] = data[i-1];
							}
						data[0] = temp;
					}	
	
		for (int i = 0; i < data.length; i++) {
			System.out.print(data[i]);
			if(i < data.length-1) {
				System.out.print(" , ");
			}
		}
		System.out.println();
	}
}