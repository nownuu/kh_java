package oop.multi4;

public class Pigeon extends Animal implements Walkable, Flyable, Barkable{

	public Pigeon(String name, int age) {
		super(name, age);
	}

	@Override
	public void bark() {
		System.out.println("구구");
	}

	@Override
	public void fly() {
		System.out.println("비둘기나 날아다닙니다.");
	}

	@Override
	public void walk() {
		System.out.println("비둘기가 걸어다닙니다.");
	}

}
