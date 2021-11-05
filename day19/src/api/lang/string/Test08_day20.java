package api.lang.string;

public class Test08_day20 {
	public static void main(String[] args) {
		
		String[] homePage = new String[5];
		homePage[0] =  "1.자바로 배우는 프로그래밍 생활";
		homePage[1] = "2.나의 자바 개발 노트";
		homePage[2] = "3. 자바를 위한, 자바에 의한 슬기로운 개발 블로그";
		homePage[3] = "4. 웹개발자가 꼭 알아야할 자바 기술 모음";
		homePage[4] = "5. 파이썬과 자바로 구현하는 하이엔드 프로그래밍";
		
		String word = "자바";
		
		for(int i=0; i<homePage.length; i++){
			if(homePage[i].contains(word)) {
				System.out.println(homePage[i]);
			}
		}
		
	}
}
