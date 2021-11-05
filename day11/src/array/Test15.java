package array;

public class Test15 {
	public static void main(String[] args) {
		
		// 선택 정렬
		// = 최소값 찾아서 들어가기
		// 정렬은 총 4번 하면 됨.
	
		int[] arr = new int[] {30, 50, 20, 10, 40}; 
		int temp;
		
		
		for(int i = 0 ; i < arr.length-1 ; i ++) { //최소값이 0부터 arr.length-1 까지
			int  min =  i;		//최소값 지정 ( 맨 앞 위치가 가장 작다고 생각)
			for(int j = i+1 ; j <arr.length ; j++) { //선택 정렬 반복문 작성
				if(arr[j] < arr[min]) { // j가 작으면 min 변경 // max로 구하고 싶으면 부등호 변경
					min = j; //위치 정보를 변경
				}
			}
			
			// 교체 시작
			temp = arr[min];
			arr[min] = arr[i];
			arr[i] = temp;
		}
		
		for(int i = 0 ; i < arr.length ; i ++) {  // 코드 결과값 나타내기
			System.out.print(arr[i]);
			if( i <  arr.length-1) { // 결과값 보기 좋게 정리하기
				System.out.print(" , ");
			}
		}
	}
}