package oop.constructor3;

public class Game {
	private String id, job;
	private int level, money;
	
		public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
		public String getJob() {
		return job;
	}
public void setJob(String job) {
		switch(job) {
			case "전사": case "마법사": case "궁수":
				this.job = job;
		}
	}
	public void setLevel(int level) {
		if(level < 1) {
			return;
		}
		this.level = level;
	}
	public int getLevel() {
		return level;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		if(money < 0) {
			return;
		}
		this.money = money;
	}
	//
	public Game(String id, String job) {
		this.id = id;
		this.job = job;
	}
	public Game(String id, String job, int level, int money) {
		this.id = id;
		this.job = job;
		this.level = level;
		this.money = money;
	}
	public void showInfo() {
		System.out.println("캐릭터 정보");
		System.out.println(this.id);
		System.out.println(this.job);
		System.out.println(this.level);
		System.out.println(this.money);
	}
}
