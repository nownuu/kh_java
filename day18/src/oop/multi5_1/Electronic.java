package oop.multi5_1;

public abstract class Electronic extends Product{

	public Electronic(String name) {
		super(name);
	}
	
	public abstract void on();
	public abstract void off();
}
