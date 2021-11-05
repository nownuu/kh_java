package array2d;

import java.util.Random;

public class Test08_1 {
	public static void main(String[] args) {
		// 빙고판 만들기 
		// 1부터 25까지의 숫자를 5*5 정수형 배열에 무작위로 추가
		Random r = new Random();
		
		
		int[] temp = new int[5*5];
		int[][] bing = new int [5][5]; //5*5 빙고
		

		for(int i=0 ; i < temp.length ; i++) { //temp 길이
			temp[i] = r.nextInt(temp.length) + 1;
				for(int k = 0 ; k < i ; k ++) {
				if(temp[k] == temp[i]) {
					i--;
				}
			}
		}
	
	
		int j = 0;
		
		for(int i = 0 ; i < bing.length ; i++) {
			for(int k = 0 ; k < bing.length ; k++) {
				bing[i][k] = temp[j];
					j = j+1;
			}
		}
		
		
		//출력 
		for(int i = 0 ; i < bing.length ; i++) {
			for(int k = 0 ; k < bing[i].length ; k++) { // 칸 반복
				System.out.print(bing[i][k]);
				System.out.print("\t");
			}
			System.out.println();
			System.out.println();
		}
	}
}

