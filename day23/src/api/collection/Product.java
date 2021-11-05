package api.collection;

import java.util.Objects;

public class Product {
	private String name;
	private String type;
	private int count;
	private int pay;
	//setter&getter
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getPay() {
		return pay;
	}
	public void setPay(int pay) {
		this.pay = pay;
	}
	@Override
	public String toString() {
		return "Product [name=" + name + ", type=" + type + ", count=" + count + ", pay=" + pay + "]";
	}

	public Product(String name, String type,int pay) {
		super();
		this.name = name;
		this.type = type;
		this.pay = pay;
	}
	
	public Product(String name, String type, int pay, int count ) {
		super();
		this.name = name;
		this.type = type;
		this.pay = pay;
		this.count = count;
	}
	@Override
	public int hashCode() {
		return Objects.hash(name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(name, other.name);
	}
	public Product(String name) {
		super();
		this.name = name;
	}
	public void sell() {
		this.count--;
	}
	public int getStock() {
		// TODO Auto-generated method stub
		return 0;
	}
	public int getPrice() {
		// TODO Auto-generated method stub
		return 0;
	}
	public void sold() {
		// TODO Auto-generated method stub
		
	}
	
}
