package array2d;

public class Test02 {
	public static void main(String[] args) {
		//2차원 배열의 필요성
		// = 3개반에서 각 3명의 학생에 대한 성적 정보
		// 0차원 변수9개 // 1차원 1차원배열 3개 // 2차원 2차원 배열 1개
		
		int[] score = new int[] {70, 80, 90};
		int[] score2 = new int[] {60, 90, 50};
		int[] score3 = new int[] {100, 80, 40};
		
		for(int i = 0 ; i < score.length ; i ++) {
			System.out.print(score[i]);
			System.out.print("\t");
		}
		System.out.println();
		
		for(int i = 0 ; i <score2.length ; i ++) {
			System.out.print(score2[i]);
			System.out.print("\t");
		}
		System.out.println();
		
		for(int i = 0; i < score3.length ; i++) {
			System.out.print(score3[i]);
			System.out.print("\t");
		}
		System.out.println();
		}
}
