package oop.inherit5;

public class File {
	private String name;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void fileSize() {
		System.out.println("파일 크기 실행.");
	}
	public void execute() {
		System.out.println("실행 기능 실행.");
	}
}
