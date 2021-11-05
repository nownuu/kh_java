package array2d;

public class Test03 {
	public static void main(String[] args) {
		//2차원 배열의 필요성
		// = 3개반에서 각 3명의 학생에 대한 성적 정보
		// 0차원 변수9개 // 1차원 1차원배열 3개 // 2차원 2차원 배열 1개
		
		int[] score1 = new int[] {70, 80, 90}; // int[] - 변수들이 묶인거
		int[] score2 = new int[] {60, 90, 50};
		int[] score3 = new int[] {100, 80, 40};
		
		int[][] score = new int[][] { //int[][] - 1차원이 묶인것
			{70, 80, 80}, //score[0]
			{60, 90, 50}, //score[1] 
			{100, 80, 40}//score[2]
		};
		
		for(int k = 0 ; k < score.length ; k ++) { //배열이 모인 배열이기 때문에 반복문 두번 사용 필요
		for(int i = 0; i < score[k].length ; i++) {
			System.out.print(score[k][i]);
			System.out.print("\t");
		}
		System.out.println();
		}
	}
}