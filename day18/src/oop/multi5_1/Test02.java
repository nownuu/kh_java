package oop.multi5_1;

public class Test02 {
	public static void main(String[] args) {
		Intbox box1 = new Intbox();
		box1.setValue(100);
		System.out.println(box1.getValue());
		
		StringBox box2 = new StringBox();
		box2.setValue("hello");
		System.out.println(box2.getValue());
		
		ElectronicBox box3 = new ElectronicBox();
//		Computer c = new Computer("슈퍼컴퓨터");
		Camera c = new Camera("디지털카메라");
		box3.setValue(c);
		
		System.out.println(box3.getValue());
		box3.getValue().on();
		box3.getValue().off();
		
		GroceryBox box4 = new GroceryBox();
//		Milk g = new Milk("파스퇴르우유", "2021-09-30");
		Bread g = new Bread("앙버터빵", "2021-09-15");
		box4.setValue(g);
		System.out.println(box4.getValue());
	}
}
