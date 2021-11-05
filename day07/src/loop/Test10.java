package loop;

public class Test10 {
	public static void main(String[] args) {
		// 1부터 10까지의 짝수 개수 출력
		int count = 0; // 계수기 역할을 수행할 변수를 0으로 설정
		int total = 0; // 누적 합계 계산을 위한 변수 0
		
		for(int i = 1 ; i<=10 ; i ++) {
			if(i%2==0) {
				System.out.println("i = "+i);
				 count ++; // count total
				 total += i; // 합계에 현재 숫자 i를 더해라
			}
			
		}
		System.out.println(count);
		System.out.println(total);
	}
}
