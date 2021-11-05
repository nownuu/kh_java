package array;

public class Test08 {
	public static void main(String[] args) {
		
		int total = 0;
		float avg = 0;
		
		
		int[] score = {95, 82, 77, 69, 75, 62, 76, 77, 85, 93};
		
		for (int i = 0; i < score.length; i++) {
			System.out.println("점수 =  " + score[i]); 
			}
			
		for (int i = 0; i < score.length; i++) {
			if(score[i] >= 80) {
				System.out.println("80점 이상 = "+score[i]);
			}
			
			total += score[i];
			}
		
			avg = total / (float) score.length ; 
			System.out.println("평균 = " + avg );
			
			
			int newScore = 76;
			int count = 0;
			for (int i = 0; i < score.length; i++) {
				if(newScore < score[i]) {
				count++;
				}
			}
				System.out.println("전학생의 카운트 = " + count);
				
				// ranking 배열에 "모든 학생의 순위" 점수 순서대로 계산하여 저장 후 점수와 연결하여 출력
				// ex. ranking[0]에는 score[0] 학생의 순위를 구하여 저장
				
				int[] ranking = new int[score.length];
				
				for(int i = 0 ; i < score.length ; i ++) {
					ranking[i] = 1;
					for(int j = 0 ; j < score.length ; j ++) {
						if(score [i] <  score [j]) {
							ranking[i]++;
						}
					}
				}
				for(int i = 0 ; i < score.length ; i ++) {
					System.out.println(score[i]+"점은"+ranking[i]+"등");
				}
			}
	}

