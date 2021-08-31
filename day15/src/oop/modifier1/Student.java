package oop.modifier1;

public class Student {
	//private = 외부 접근 차단 키워드 (안정성)
	private String name;
	private int score;
	
	void setName(String name) {
		this.name = name;
	}
	void setScore(int score) {
		if(score < 0 || score > 100 ) {
			return;
		}
		this.score = score;
	}
	String getName() {
		return this.name;
	}
	int getScore() {
		return this.score;
	}
	void init(String name, int score) {
		this.setName(name);
		this.setScore(score);
	}
	void showInfo() {
		System.out.println(this.name);
		System.out.println(this.score);
	}
}
