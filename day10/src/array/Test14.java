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
		
		System.out.println("회전 한 결과");
		int temp = data[0];
		data[0] = data[4];
		data[4] = data[3];
		data[3] = data[2];
		data[2] = data[1];
		data[1] = temp;
		
		for (int i = 0; i < data.length; i++) {
			System.out.println(data[i]);
		}
		
		// 2번 문제
		
		Scanner sc = new Scanner(System.in);

		System.out.print("회전 카운트 입력 = ");
		int count = sc.nextInt();
		
		for (int i = 0; i < count; i++) {
			temp = data[0];
			data[0] = data[4];
			data[4] = data[3];
			data[3] = data[2];
			data[2] = data[1];
			data[1] = temp;
		}
		for (int i = 0; i < data.length; i++) {
			System.out.println(data[i]);
		}
	}
}
