package api.collection3;

import java.util.Objects;

public class Car {
	private String name;
	private int people;
	private int price;
	private boolean rent;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPeople() {
		return people;
	}
	public void setPeople(int people) {
		this.people = people;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public boolean getRent() {
		return rent;
	}
	public void setRent(boolean rent) {
		this.rent = rent;
	}
	public void noRent() {
		this.rent = !rent;
	}
	@Override
	public String toString() {
		return "Car [name=" + name + ", people=" + people + ", price=" + price + ", rent=" + rent + "]";
	}
	public Car(String name, int people, int price) {
		super();
		this.name = name;
		this.people = people;
		this.price = price;
	}
}
