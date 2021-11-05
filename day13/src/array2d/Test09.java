package array2d;

import java.util.Random;

public class Test09 {
	public static void main(String[] args) {
		// 지뢰찾기
		Random r= new Random();
	
		int[][]  map = new int[8][10];
		int bomp = 10;
		
		for(int i = 0 ; i <=bomp ; i++) {
			int x = r.nextInt(8);
			int y = r.nextInt(10);
			System.out.println(i + "번째 폭탄을 ("+x+","+y+")에 배치합니다.");
			if(map[x][y] == 0) {
				map[x][y] = 9 ;
		}
			else {
				i--;
			}
		}
		//출력 
		for(int i = 0 ; i < map.length ; i++) {
			for(int k = 0 ; k < map[i].length ; k++) { // 칸 반복
				System.out.print(map[i][k]);
				System.out.print("\t");
			}
			System.out.println();
			System.out.println();
		}
	}
}	
