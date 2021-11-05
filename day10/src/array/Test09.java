package array;

public class Test09 {
	public static void main(String[] args) {
		
		int[] score = {95, 82, 77, 69, 75, 62, 76, 77, 85, 93};
		
		int max = score[0]; // 맨 앞에 있는 값이 최댓값이라고 가정을 하고 시작
		int min = score[0];
		
		for(int i = 1 ; i < score.length ; i ++) {
			if(score[i] > max) { //score값이 max값보다 크면 최댓값
				max = score[i];
				}
			if(min > score[i]) {//min값이 score 값보다 크면 최솟값
				min = score[i];
			}
		}
		System.out.println("최댓값 = "+max);
		System.out.println("최솟값 = "+min);
	}
}

