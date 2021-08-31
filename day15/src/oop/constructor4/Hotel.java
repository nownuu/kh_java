package oop.constructor4;

public class Hotel {
	private String name;
	private int people, nonprice, mprice, tprice;
	
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
		if(people < 2) {
			return;
		}
		this.people = people;
	}
	public int getNonprice() {
		return nonprice;
	}
	public void setNonprice(int nonprice) {
		if(nonprice < 0) {
			return;
		}
		this.nonprice = nonprice;
	}
	public int getMprice() {
		return mprice;
	}
	public void setMprice(int mprice) {
		if(mprice<0) {
			return;
		}
		this.mprice = mprice;
	}
	public int getTprice() {
		return tprice;
	}
	public void setTprice(int tprice) {
		if(tprice<0) {
			return;
		}
		this.tprice = tprice;
	}
	
	public Hotel(String name, int people, int nonprice) {
		this.name = name;
		this.people = people;
		this.nonprice = nonprice;
		this.mprice = nonprice;
		this.tprice = nonprice;
	}
	public Hotel(String name, int people, int nonprice, int tprice) {
		this.name = name;
		this.people = people;
		this.nonprice = nonprice;
		this.mprice = tprice;
		this.tprice = tprice;
	}

	public Hotel(String name, int people, int nonprice, int mprice, int tprice) {
		this.name = name;
		this.people = people;
		this.nonprice = nonprice;
		this.mprice = mprice;
		this.tprice = tprice;
	}

	public void showInfo() {
		System.out.println("KH호텔 객실 요금");
		System.out.println(this.name);
		System.out.println(this.people+"명");
		System.out.println(this.nonprice+"만원");
		System.out.println(this.mprice+"만원");
		System.out.println(this.tprice+"만원");
	}
}
