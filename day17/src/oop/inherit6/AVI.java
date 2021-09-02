package oop.inherit6;

public class AVI extends MediaFile{
	
	private float speed;
	
	public AVI(String fileName, long fileSize) {
		super(fileName, fileSize);
		this.speed = 1f;
	}
	
	public AVI(String fileName, long fileSize, float speed) {
		super(fileName, fileSize);
		this.speed = speed;
	}
	
	public void execute() {
		System.out.println("영상을 재생합니다.");
	}
}
