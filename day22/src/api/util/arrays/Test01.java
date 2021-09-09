package api.util.arrays;

import java.util.Arrays;

public class Test01 {
	public static void main(String[] args) {
		//Arrays 클래스 : 배열에 대한 처리르 ㄹ도와주는 클래스
		
		int[] arr = new int[] {30, 50, 20, 10, 40};
		
		//출력
		System.out.println(Arrays.toString(arr));
		
		// 채우기
		Arrays.fill(arr, 0);
		System.out.println(Arrays.toString(arr));
		
		// 20은 몇 번째 위치에 있습니까?
		int index = Arrays.binarySearch(arr, 20);
		System.out.println("index = "+index);
		
		
		
	}
}
