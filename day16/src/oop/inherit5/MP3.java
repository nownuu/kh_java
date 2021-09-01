package oop.inherit5;

public class MP3 extends File{
	public void duration() {
		System.out.println("재생시간이 초단위  실행.");
	}
	public void forward() {
		System.out.println("빨리감기  실행.");
	}
	public void rewind() {
		System.out.println("되감기  실행.");
	}
}
