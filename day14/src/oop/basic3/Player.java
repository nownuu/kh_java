package oop.basic3;

public class Player {

	// 맴버변수 - 데이터 저장
	String name, type;
	int gold, silver, bronze;
	
	//맴버 메소드 - 코드 저장 공간
	// void 이름(){ 코드 }
	void init(String name, String type, int gold, int silver, int bronze) {
		this.name = name;
		this.type =  type;
		this.gold = gold; 
		this.silver = silver;
		this.bronze = bronze;
	}
	
	void showInfo() {
		//a, b, c 같은 특정 대상이 아니라 주인공을 의미하는 키워드를 사용 = this
		System.out.println("선수 정보");
		System.out.println(this.name);
		System.out.println(this.type);
		System.out.println(this.gold);
		System.out.println(this.silver);
		System.out.println(this.bronze);
		}
	}

