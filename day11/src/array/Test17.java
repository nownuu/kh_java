package array;

public class Test17 {
	public static void main(String[] args) {
		
		// 삽입 정렬
		// = 비교값이 작으면 앞으로 배열, 아니면 그 다음 값과 비교
		
			int[] arr = new int[] {30, 50, 20, 10, 40};
			
			
			for(int i = 1; i < arr.length ; i++) { //원본 코드 반복문 시작
				int j = i - 1; // 비교값 설정
				int temp = arr[i]; //temp에 arr[i] 미리 넣기
				while( j >= 0 && temp < arr[j]) { //삽입 코드 반복문 시작 (temp보다 arr j가 더 크면
						arr[j+1] = arr[j]; // 우측으로 1칸 
								j --; // location 1감소
						}
						arr[j+1] = temp;
				}
			
			
			for(int i = 0 ; i < arr.length ; i ++) {  // 코드 결과값 나타내기
				System.out.print(arr[i]);
				if( i <  arr.length-1) { // 결과값 보기 좋게 정리하기
					System.out.print(" , " );
				}
			}
	}		
}