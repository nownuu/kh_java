package oop.multi4;
// 재정의가 가능한 효율적인 메소드

// 강아지의 특징(행동 = 기능)
// 동물, 걸어다님, 짖을 수 있다. 
public class Dog extends Animal implements Walkable, Barkable{

	public Dog(String name, int age) {
		super(name, age);
	}

	@Override
	public void bark() {
		System.out.println("멍멍");
	}
	@Override
	public void walk() {
		System.out.println("강아지가 걸어다닙니다!");
	}
}
