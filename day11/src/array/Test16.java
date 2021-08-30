package array;

public class Test16 {
	public static void main(String[] args) {
		
		// 버블 정렬
		// 큰 데이터를 오른쪽으로 움직이게 하는 정렬
		
		int[] arr = new int[] {30, 50, 20, 10, 40};
		int temp;
		
		// 버블 정렬 코드
		
		for(int i = 0 ; i < arr.length ; i++) { //원본 코드 반복문 시작
			for(int j = 0 ; j < arr.length - 1 ;  j ++) { //버블 정렬 코드 반복문 시작
				if(arr[j]>arr[j+1]) { // 기준 위치와 기준 오른쪽 위치 배열
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp; // 배열 끝
				}
			}
		}
		
		for(int i = 0 ; i < arr.length ; i ++) {  // 코드 결과값 나타내기
		System.out.print(arr[i]);
		if( i <  arr.length-1) { // 결과값 보기 좋게 정리하기
			System.out.print(" , " );
		}
		}
	}
}