package oop.total1;

public class Program {
	
	private String id, secret, nickname, grade;
	private int point;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getSecret() {
		return secret;
	}
	public void setSecret(String secret) {
		this.secret = secret;
	}
	public String getNickname() {
		return nickname;
	}
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		switch(grade) {
		case "준회원":
		case "정회원":
		case "우수회원":
		case "특별회원":
		case "VVIP":
		case "관리자":
		this.grade = grade;
		}
	}
	public int getPoint() {
		return point;
	}
	public void setPoint(int point) {
		if(point<0) {
			return;
		}
		this.point = point;
	}

	public Program(String id, String secret, String nickname) {
		this.setId(id);
		this.setSecret (secret);
		this.setNickname (nickname);
		this.setPoint (100);
		this.setGrade ("준회원");
	}
	
	public void showInfo() {
		System.out.println("회원가입");
		System.out.println(this.id);
		System.out.println("비밀번호는 공개되지 않습니다.");
		System.out.println(this.nickname);
		System.out.println(this.point);
		System.out.println(this.grade);
	}
}
