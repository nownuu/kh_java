package oop.inherit9;

public class Test02 {
	public static void main(String[] args) {
		
		Shape s1 = new Circle(5); //업캐스팅
		System.out.println(s1.area());

		Shape s2 = new Rect(5, 7);
		System.out.println(s2.area());

		Shape s3 = new Triangle(5, 7);
		System.out.println(s3.area());
	}
}
