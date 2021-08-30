package oop.method5;

public class Student {

	String name ;
	int grade, kor, eng, math;
	//
	void setName(String name) {
		this.name = name;
	}
	void setSubject(int grade) {
		this.grade = grade;
	}
	void setKor(int kor) {
		this.kor = kor;
	}
	void setEng(int eng) {
		this.eng = eng;
	}
	void setMath(int math) {
		this.math = math;
	}
	
	void init(String name, int grade, int kor, int eng, int math) {
		this.setName(name);
		this.setSubject(grade);
		this.setKor(kor);
		this.setEng(eng);
		this.setMath(math);
	}
	//
	
	String getName() {
		return this.name;
	}
	int getGrade() {
		return this.grade;
	}
	int getKor() {
		return this.kor;
	}
	int getEng() {
		return this.eng;
	}
	int getMath() {
		return this.math;
	}
	int getTotal() {
		return this.eng +this.kor + this.math;
	}
	float getAverage() {
		return this.getTotal()/3.0f;
	}
	boolean getRank() {
		return this.getAverage()>0 && this.getAverage()<=100;
	}
	//
	void showInfo() {
		System.out.println("성적 정보");
		System.out.println("학생 이름 = "+this.name);
		System.out.println("학년 = "+ this.grade);
		System.out.println("국어 성적 = "+this.kor);
		System.out.println("영어 성적 = "+this.eng);
		System.out.println("수학 성적 = "+this.math);
		System.out.println("총점 = "+this.getTotal());
		System.out.println("평균 = "+this.getAverage());
		
		if(this.getAverage()>90 && this.getAverage()<=100) {
			System.out.println("A등급");
		}
		else if(this.getAverage()>80 && this.getAverage()<=90) {
			System.out.println("B등급");
		}
		else if(this.getAverage()>70 && this.getAverage()<=80) {
			System.out.println("C등급");
		}
		else {
			System.out.println("F등급");
		}
	}
}
