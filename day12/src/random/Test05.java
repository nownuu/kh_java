package random;
import java.util.Random;

public class Test05 {
	public static void main(String[] args) {

		// 주사위 10개 배열 
		int[] dice = new int[10];
		
		Random r = new Random();
		for(int i = 0 ; i < dice.length ; i ++) {
			dice[i] = r.nextInt(6)+1;
		}
			for(int i = 0 ; i < dice.length ; i++) {
				System.out.println("주사위 = "+dice[i]);
			}
		
	// 주사위 10번 평균 구하기 
			int sum = 0;
			for(int i = 0 ; i < dice.length ; i++) {
				sum +=dice[i];
			}
		System.out.println("\n평균을 구하세요");
			float average = (float) sum/dice.length;
			System.out.println("평균 주사위 = "+average);
			
	//결과를 내림차순으로 정렬하여 출력하세요(정렬방법 무관)
			for(int i = 1; i < dice.length ; i++) { //원본 코드 반복문 시작
				int j = i - 1; // 비교값 설정
				int temp = dice[i]; //temp에 arr[i] 미리 넣기
				while( j >= 0 && temp < dice[j]) { //삽입 코드 반복문 시작 (temp보다 arr j가 더 크면
						dice[j+1] = dice[j]; // 우측으로 1칸 
								j --; // location 1감소
						}
						dice[j+1] = temp;
				}
			
			
			for(int i = 0 ; i < dice.length ; i ++) {  // 코드 결과값 나타내기
				System.out.print(dice[i]);
				if( i <  dice.length-1) { // 결과값 보기 좋게 정리하기
					System.out.print(" , " );
				}
			}
			
	// 각 주사위값이 나온 횟수를 구하여 출력하세요.
				int[] count = new int[6];
				for(int i = 0 ; i < dice.length ; i ++) {
					count[dice[i]-1]++ ; 
					}
				for(int i = 0 ; i < count.length ; i++) {
					System.out.println("\n"+(i+1)+"의 횟수"+count[i]);
			}
		}
	}
	