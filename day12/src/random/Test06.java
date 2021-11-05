package random;
import java.util.Random;
public class Test06 {
	public static void main(String[] args) {
		
		//이번주 로또번호를 추첨한 결과를 배열에 저장하세요.
		// 중복 인정 안됨.\
	
		Random r = new Random();

		int[] lotto = new int[6];
		
		for(int i=0; i < lotto.length; i++) {
			lotto[i] = r.nextInt(45) + 1;

			//처음(0)부터 현재위치 바로앞(i-1)까지 반복하며 중복데이터를 검사
			for(int k=0; k < i; k++) {
				if(lotto[i] == lotto[k]) {
					i--;//위치증가가 일어나지 않도록 상쇄 처리
					break;//성능 향상을 위한 처리(중복 데이터 발견 시 비교 즉시 종료)
				}
			}
		}
		for(int i = 0 ; i < lotto.length ; i++) {
			System.out.print(lotto[i]);
			if( i <  lotto.length-1) { // 결과값 보기 좋게 정리하기
				System.out.print(" , " );
			}
		}
		
		int temp;
		
		// 버블 정렬 코드
		
		for(int i = 0 ; i < lotto.length ; i++) { //원본 코드 반복문 시작
			for(int j = 0 ; j < lotto.length - 1 ;  j ++) { //버블 정렬 코드 반복문 시작
				if(lotto[j]>lotto[j+1]) { // 기준 위치와 기준 오른쪽 위치 배열
					temp = lotto[j];
					lotto[j] = lotto[j+1];
					lotto[j+1] = temp; // 배열 끝
				}
			}
		}
		System.out.print("\n");
		for(int i = 0 ; i < lotto.length ; i ++) {  // 코드 결과값 나타내기
		System.out.print(lotto[i]);
		if( i <  lotto.length-1) { // 결과값 보기 좋게 정리하기
			System.out.print(" , " );
		}
		}
	}
}
