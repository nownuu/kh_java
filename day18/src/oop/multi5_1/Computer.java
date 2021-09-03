package oop.multi5_1;

public class Computer extends Electronic implements Brokenable{

	public Computer(String name) {
		super(name);
	}

	@Override
	public void on() {
		System.out.println("카메라 전원을 킵니다");
	}

	@Override
	public void off() {
		System.out.println("카메라 전원을 끕니다");
		
	}

}
