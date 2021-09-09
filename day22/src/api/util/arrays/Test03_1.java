package api.util.arrays;

import java.util.Arrays;
import java.util.Comparator;

public class Test03_1 {
	public static void main(String[] args) {
		//Arrays를 이용한 정렬(sort)
		
		Integer[] data = new Integer[] {30, 50, 20, 10, 40};
		
	// Arrays.sort(data);
	//	Arrays.sort(data, 1, 3); //부분 오름차순 정렬(1부터 3전까지)
		
		//generic type에는 참조형만 작성할 수 있다. Integer = int 
		Comparator<Integer> c = new Comparator<Integer>() { //추상메소드가 1개
			
			public int compare(Integer o1, Integer o2) { 
				// + 순서교체 0은 동일, -는 현상 유지를 의미
				// o1이 앞쪽에 있는 데이터, o2가 뒤쪽에 있는 데이터
				// = 오름차순이 되려면 앞에 있는 데이터가 뒤에 있는 데이터보다 작아야함
				// = 내림차순이 되려면 앞에 있는 데이터가 뒤에 있느 데이터 보다 커야함
				/*
				if(o1 <o2) {//앞이 작으면
					return 1; //바꾸세요
				}
				else if(o1 > o2) {
					return 1;
				}
				else {
					return 0;
				}
				*/
				return o2 - o1;
			}
		};
	
		
		Arrays.sort(data, c);//data라는 배열을 c라는 비교기준에 의해서 정렬해라
		System.out.println(Arrays.toString(data)); //정렬방식 = 오름차순
	
	}
}
