package oop.keyword9;

public class Bank {
	// 정적 데이터
	private static float rate = 1.2f;
	public static float getRate() {
		return rate;
	}
	public static void setRate(float rate) {
		if(rate < 0f) {
		Bank.rate = rate;
		}
	}
	// 동적 데이터
	private String name;
	private float topRate;
	private int money;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getTopRate() {
		return topRate;
	}
	public void setTopRate(float topRate) {
		this.topRate = topRate;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	//생성자
	
	public Bank(String name) {
		this(name, 0f, 0);
	}
	public Bank(String name, float topRate) {
		this(name, topRate, 0);
	}
	public Bank(String name, float topRate, int money) {
		this.setName(name);
		this.setTopRate(topRate);
		this.setMoney(money);
	}
	public void showInfo() {
		System.out.println("<<계좌 정보>>");
		System.out.println("소유자 = "+name);
		System.out.println("기본 이율 = "+rate);
		System.out.println("우대비율 = "+topRate);
		System.out.println("잔액 = "+money);
	}
}
