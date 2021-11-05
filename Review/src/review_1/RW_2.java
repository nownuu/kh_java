package review_1;

import java.util.Random;

public class RW_2 {
	public static void main(String[] args) {
		//지뢰찾기
		int[][] map = new int[8][10];
		int bomb = 10;
		
		//폭탄 배치
		Random r = new Random();
		for(int i=1; i <= bomb; i++) {
			int x = r.nextInt(8);
			int y = r.nextInt(10);
			//System.out.println(i+"번째 폭탄을 ("+x+", "+y+")에 배치합니다");
			//if(배치된적이 없는 자리라면) {
			if(map[x][y] == 0) {
				map[x][y] = 9;
			}
			else {
				i--;
			}
		}
		
		//숫자 카운트
		int row = map.length;
		int col = map[0].length;
		for(int i=0; i < row; i++) {
			for(int k=0; k < col; k++) {
				System.out.println("("+i+","+k+") 칸에 대한 검사를 시작합니다");
				System.out.println("---> 계산 범위를 산출합니다");
				int xmin = i-1, xmax = i+1;
				int ymin = k-1, ymax = k+1;
				if(xmin < 0) xmin = 0;
				if(xmax >= row) xmax = row-1;
				if(ymin < 0) ymin = 0;
				if(ymax >= col) ymax = col-1;
				System.out.println("---> x 범위 : "+xmin+"부터 "+xmax+"까지");
				System.out.println("---> y 범위 : "+ymin+"부터 "+ymax+"까지");
				
				if(map[i][k] != 9) {//현재 칸이 폭탄이 아니라면
					int count = 0;
					for(int x = xmin; x <= xmax; x++) {
						for(int y = ymin; y <= ymax; y++) {
							System.out.println("------> ("+x+","+y+") 칸을 검사합니다");
							
								if(map[x][y] == 9) {//폭탄을 발견하면
									count++;//폭탄 개수 카운트 증가
									System.out.println("------> 폭탄 발견");
								}
						}
					}
					System.out.println("------> 감지된 폭탄 개수 : "+count);
					map[i][k] = count;
				}
			}
		}
		
		//출력
		for(int i=0; i < map.length; i++) {
			for(int k=0; k < map[i].length; k++) {
				System.out.print(map[i][k]);
				System.out.print("\t");
			}
			System.out.println("\n");
		}
	}
}
