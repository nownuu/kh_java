package array;

public class Test12 {
	public static void main(String[] args) {
		
		int[] data = new int[] {30, 50, 20, 10, 40};
		int[] reverseData =  new int[data.length];
		
		System.out.println("순서대로 출력");
		for (int i = 0 ; i < data.length ; i ++) {
			System.out.println(data[i]);
		}
		
		System.out.println("반대로 변경하여 출력");
		for (int i = data.length - 1, j = 0; i >= 0; i--, j++) {
			reverseData[j] = data[i];
			System.out.println(reverseData[j]);
		}
	}
}

