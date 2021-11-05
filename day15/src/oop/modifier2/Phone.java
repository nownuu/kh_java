package oop.modifier2;

public class Phone {
	
	private String name, firm;
	private int term, money;
	
	void setName(String name) {
		this.name = name;
	}
	void setFirm(String firm) {
		switch(firm) {
		case "SK":
		case "KT":
		case "LGplus":
		case "알뜰폰":
			this.firm = firm;
		}
	}
	void setTerm(int term) {
		switch(term) {
			case 24: case 30: case 36:
			this.term = term;
		}
	}
	void setMoney(int money) {
		if(money > 0 ) {
		this.money = money;
		}
	}
	String getName() {
		return this.name;
	}
	String getFirm() {
		return this.firm;
	}
	int getTerm() {
		return this.term;
	}
	int getMoney() {
		return this.money;
	}
	
	//외부 패키지에서도 이용하게 만들려면 public을 붙여줘야함.
	public void init(String name, String firm, int term, int money) {
		this.setName(name);
		this.setFirm(firm);
		this.setTerm(term);
		this.setMoney(money);
	}
	
	void showInfo(){
		System.out.println("휴대폰 정보");
		System.out.println("기종 = "+this.name);
		System.out.println("통신사 = "+this.firm);
		System.out.println("약정기간 = "+this.term+"개월");
		System.out.println("할부원금 = "+this.money+"만원");
	}
}
