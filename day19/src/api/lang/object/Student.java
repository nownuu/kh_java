package api.lang.object;

import java.util.Objects;

//Q : 내가 만든 클래스와 Object의 관계
public class Student {
	private String name;
	private int score;
	
	public Student() {}
	public Student(String name, int score) {
		this.name = name;
		this.score = score;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", score=" + score + "]";
	}

	
	// 만약 equals()를 이용한 비교를 허용한다면 자동생성메뉴에서 equals and hashcode를 재정의해야한다.
	// = 비교 : 이름이 같으면 같다라고 판정되도록 구현할 계획
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
		Student other = (Student) obj;
		return Objects.equals(name, other.name);
	}
}
