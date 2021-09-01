package oop.keyword2;

public class User {

	private String title;
	private final int width, height;
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getWidth() {
		return width;
	}
	
	public int getHeight() {
		return height;
	}
	// 생성자 몰아주기 : 코드의 중복을 감소시키기 위해
	//  								다 설정하는 생성자에게 모든 데이터 설정을 위임
	public User() { // 기본 생성자
		this.setTitle("Untitle");
		this.width = 600;
		this.height = 400;
	}
	public User(String title) {
		this.setTitle(title);
		this.width = 600;
		this.height = 400;
	}
	public User(int width, int height) {
		this.setTitle("Untitle");
		this.width = width;
		this.height = height;
	}
	public User(String title, int width, int height) {
		this.setTitle(title);
		if(width>0) {
			this.width = width;
		}
		else {
			this.width = 600;
		}
		if(height>0) {
			this.height = height;
		}
		else {
			this.height = 400;
		}
	}
	
	public  void showInfo() {
		System.out.println("요구상항");
		System.out.println(this.title);
		System.out.println(this.width);
		System.out.println(this.height);
	}
	
	
}
