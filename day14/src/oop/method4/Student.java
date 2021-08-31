package oop.method4;

public class Student {

	String name, subject;
	int score1, score2;
	
	
	void setName(String name) {
		this.name = name;
	}
	void setSubject(String subject) {
		this.subject = subject;
	}
	void setScore1(int score1) {
		if(score1 < 0 || score1 > 100) {
			return;
		}
		this.score1 = score1;
	}
	void setScore2(int score2) {
		if(score2 < 0 || score2 > 100) {
			return;
		}
		this.score2 = score2;
	}
	void init(String name, String subject, int score1, int score2) {
		this.setName(name);
		this.setSubject(subject);
		this.setScore1(score1);
		this.setScore2(score2);
	}
	
	// 원하는 정보를 원하는 형태로 반환하는 메소드
	// getter 메소드
	// 세터 메서드처럼 이름을 짓고, 세터 메소드처럼 변수당 1개씩은 기본적으로 생성
	// 필요하다면 추가적으로 더 생성할 수도 있다.
	// ex ; name의 getter 메소드는 getName
	
	String getName() {
		return this.name; // 주인공의 이름으 ㄹ부른 대상에게 반환하세요
	}
	String getSubject() {
		return this.subject;
	}
	int getScore1() {
		return this.score1;
	}
	int getScore2() {
		return this.score2;
	}
	
	int getTotal() {
		return this.score1 + this.score2;
	}
	float getAverage() {
		return this.getTotal()/2.0f;
	}
	boolean getPass() {
		return this.getScore1() >= 40 && this.getScore2() >= 40 && this.getAverage() >= 60;
	}
	void showInfo() {
		System.out.println("성적 정보");
		//일반 정보들은 멤버 변수로 관리햐아한다. (학생의 고유 정보이기때문)
		System.out.println(this.name);
		System.out.println(this.subject);
		System.out.println(this.score1);
		System.out.println(this.score2);
		
		System.out.println(this.getAverage());
		
		
		if(this.getPass()) {
			System.out.println("합격");
		}
		else {
			System.out.println("불합격");
		}
	}
}
