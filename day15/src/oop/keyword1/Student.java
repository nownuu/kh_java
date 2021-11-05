package oop.keyword1;

public class Student {
	//목표 ; 이름은 단 한번만 설정 가능하도록 구현
	// 세터 메소드를 생성하지 말아야하며
	// 생성자에서 초기화를 반드시 수행
	// 프로그래밍 배치 등으로 구현하기는 어렵고
	//final이라는 키워드는 사용하면 구현 가능
	private final String name;
	private int score;
	
	public Student(String name) {
		this.name = name;
	}
	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public String getName() {
		return name;
	}
	
}
