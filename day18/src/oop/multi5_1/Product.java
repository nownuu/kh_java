package oop.multi5_1;

public class Product {
	protected String name;
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	
	public Product(String name) {
		this.setName(name);
	}
}
