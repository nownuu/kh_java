package api.lang.string;

public class Test08_4 {
	public static void main(String[] args) {
		String example = "간장공장 공장장은 강공장장이고 된장공장 공장장은 된공장장이다.";
		
		String word = "공장";
		
		int index = 0 ;
		int count = 0 ;
		
		while(true) {
			index = example.indexOf(word, index);
			System.out.println("index = "+index);
			}
		if(index == 1) {
			break;
		}
		count++;
		index++;
		
		return;
	}
}
