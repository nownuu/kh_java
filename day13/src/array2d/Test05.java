package array2d;

public class Test05 {
	public static void main(String[] args) {
		
		int[][] data = new int[5][5]; // 배열 생성
		
		//초기화
		int count = 1;
		for(int i = 0 ; i < data.length ; i++) {
			for(int k = 0 ; k < data[i].length ; k++) {
			data[k][i] =  count++;
			}
		}
	
		//출력
		for(int i = 0 ; i < data.length ; i++) {
			for(int k = 0 ; k < data[i].length ; k++) { // 칸 반복
				System.out.print(data[i][k]);
				System.out.print("\t");
			}
			System.out.println();
			System.out.println();
		}
	}
}
