package api.lang.string;

public class Test09 {
	public static void main(String[] args) {
		//문자열 기타 명령들
		
		//1. 문자열 분해 - split()
		
		String colors = "빨/주/노/토/파/남/보";
		
		String[] colorList = colors.split("/");
		
		System.out.println("생상은 총 " + colorList.length+"개 있습니다.");
		for(int i = 0 ; i<colorList.length ; i ++) {
			System.out.println(colorList[i]);
		}
		
		// 2. 원시형 자료형과의 변환(ex. int <----> String)
		
		int a = 10;
		String b = ""+a; //편법 : 문자열 덧셈은 결과가 문자열
		String c = String.valueOf(a);
		System.out.println(c);
		
		String d = "12345";
		int e = Integer.parseInt(d);
		System.out.println(e);
		
		
	}
}
