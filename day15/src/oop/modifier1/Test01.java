package oop.modifier1;

public class Test01 {
	public static void main(String[] args) {
		Student s = new Student();
		
		s.setName("피카츄");
		s.setScore(75);
		
		System.out.println(s.getName());
		System.out.println(s.getScore()); 
		//set 메소드를 사용했기때문에 get으로 꺼내야함
		
	}
}
