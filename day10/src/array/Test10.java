package array;

public class Test10 {
	public static void main(String[] args) {
		
		int[] score = {95, 82, 77, 69, 75, 62, 76, 77, 85, 93};
		
		int maxIndex = 0;
		int minIndex = 0;
		
		for(int i = 1 ; i < score.length ; i ++) {
			if(score[maxIndex] < score.length) {//maxIndex 위치의 데이터보다 더 큰 데이터를 발견하면 위치 갱신
				maxIndex = i;
			}
			
			if(score[minIndex] > score.length) {
				minIndex = i;
			}
		}
		
		System.out.println(maxIndex+1);
		System.out.println(minIndex+1);
	}
}
