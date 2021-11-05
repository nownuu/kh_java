package oop.keyword7;

public class Sonata {
	private static String company; //제조사
	private String color;
	private int price;
	
	public static String getCompany() {
		return company;
	}
	public static  void setCompany(String company) {
		Sonata.company = company;
	}
	
	public Sonata(String company, String color, int price) {
		//this.company = company; (경고 주인공 것이 아님)
		Sonata.company = company;
		this.color = color;
		this.price = price;
	}

	@Override
	public String toString() {
		return "Sonata [company=" + company + ", color=" + color + ", price=" + price + "]";
	}

	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
}
