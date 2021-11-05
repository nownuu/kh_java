package oop.multi4;

public class Test01 {
	public static void main(String[] args) {
		// 강아지 한 마리 생성
		
		Dog dog = new Dog("말티즈", 7);
		
		//Q. 강아지는 날아다닐 수 있습니까?
		// = Dog 클래스가 Flyable 클래스의 자식 클래스입니까?
		// = instanceof 연산자를 이용하면 상속 관게인지 검사를 할 수 있다.
		
		System.out.println(dog instanceof Dog); // dog는 Dog 클래스의 구현체입니까?
		System.out.println(dog instanceof Flyable); //dog는 Flyable 클래스의 구현체입니까?
		System.out.println(dog instanceof Walkable);
		
		if(dog instanceof Flyable) {
			System.out.println("날아다닐 수 있습니다.");
		}
		else {
			System.out.println("날아다닐 수 없습니다.");
		}
		
		//Q 비둘기 객체를 만들고 비둘기가 짖을 수 있는지 판정하여 출력
		
		Pigeon pigeon = new Pigeon("비둘기", 1);
		
		if(pigeon instanceof Barkable) {
			System.out.println("비둘기는 짖을 수 있습니다.");
		}
		else {
			System.out.println("비둘기는 짖을 수 없습니다.");
		}
	}
}
