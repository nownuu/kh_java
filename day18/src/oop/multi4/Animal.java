package oop.multi4;

public class Animal {
	protected String name;
	protected int age;
	
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	public void lookAt() {
		System.out.println(name+"이 당신을 쳐다봅니다.");
	}
	
	public void showInfo() {
		System.out.println("동물정보");
		System.out.println("품종 = "+name);
		System.out.println("나이 = "+age);
	}
}
