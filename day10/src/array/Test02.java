package array;

public class Test02 {
	public static void main(String[] args) {
		//변수: 단일 데이터 저장소
		// 어떤 상황에서 변수로 처리하는 것이 어려운지 파악하는 것이 중요!
		
		int [] arr = new int [5]; //arr ---> [0] [0] [0] [0] [0] 0=기본값(new가 있어서)
															//1지점 +1지점 +2지점 +3지점 +4지점 (순서)
		
		int value = 10;
		for(int i = 0 ; i < 5 ; i ++) {
			arr[i] = value;
			value += 10;
		}
		
		int total =  0 ;
		for(int i = 0 ; i < 5 ; i ++) {
			total += arr[i];
		}
		
		for(int i = 0 ; i <5 ; i ++) {
			System.out.println("arr [i] = " + arr[i]);
		}
		
		System.out.println("total = "+total);
	}
}
