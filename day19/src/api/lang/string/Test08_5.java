package api.lang.string;

public class Test08_5 {
	public static void main(String[] args) {
		String example = "간장공장 공장장은 강공장장이고 된장공장 공장장은 된공장장이다.";
		
		String word = "공장";
		
		int index = example.indexOf(word);
		System.out.println("index = "+index);
		
		index = example.indexOf(word,3);
		System.out.println("index = "+index);
		
		index = example.indexOf(word,6);
		System.out.println("index = "+index);
		
		index = example.indexOf(word,12);
		System.out.println("index = "+index);
		
		index = example.indexOf(word,20);
		System.out.println("index = "+index);
		
		index = example.indexOf(word,23);
		System.out.println("index = "+index);
		
		index = example.indexOf(word,29);
		System.out.println("index = "+index);
	}
}
