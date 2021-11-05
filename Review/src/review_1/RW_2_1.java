package review_1;

import java.util.Random;

public class RW_2_1 {
	public static void main(String[] args) {
		// 지뢰 찾기
		
		int[][] map = new int[9][9];
		int bomb = 10;
		
		Random r = new Random();
		for(int i = 1 ; i <= bomb ; i ++) {
			int x = r.nextInt(9);
			int y = r.nextInt(9);
		
		if(map[x][y] == 0) {
			map[x][y] = 9;
			}
		else {
			i--;
		}
	}
		
		int row = map.length;
		int col = map[0].length;
		
		for(int i = 0; i<row; i++) {
			for(int k = 0; k<col; k++) {
				System.out.println("("+i+","+k+") 칸에 대한 검사를 시작합니다");
				System.out.println("==================================");
				
				int xmin = i -1 , xmax = i +1;
				int ymin = k-1, ymax = k +1;
				
				if(xmin < 0) xmin =0;
				if(xmax >= row) xmax = row -1;
				if(ymin < 0) ymin =0;
				if(ymax >= col) ymax = col -1;
				
				System.out.println("X범위 : "+xmin+"부터 "+xmax+"까지");
				System.out.println("Y 범위 : "+ymin+"부터 "+ymax+"까지");
				
				if(map[i][k] != 9 ) {
					int count = 0;
					for(int x = xmin; x <= xmax ; x++) {
						for(int y = ymin; y <= ymax; y++) {
							System.out.println(" ("+x+","+y+") 칸을 검사합니다.");
							
								if(map[x][y] == 9) {
									count++;
									System.out.println("! 폭탄 발견.");
								}
							}
						}
					System.out.println("==================================");
					System.out.println("감지된 폭탄의 수 "+count);
					map[i][k] = count;
				}
			}
		}
		//출력
		for(int i = 0 ; i < map.length; i++) {
			for(int k = 0 ; k <map[i].length; k++) {
				System.out.print(map[i][k]);
				System.out.print("\t");
			}
			System.out.println("\n");
		}
	}
}
