package oop.inherit5;

public class File {
	// 공통변수 생성
	private String name;
	private float fileSize;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public float getFileSize() {
		return fileSize;
	}
	public void setFileSize(float fileSize) {
		this.fileSize = fileSize;
	}
	// 공통 메소드 생성
	public void execute() {
		System.out.println("실행 기능 실행.");
	}
}
