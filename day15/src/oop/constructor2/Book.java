package oop.constructor2;

public class Book {
	private String title, publisher, writer;
	private int price;
	
	// Q 책을 만드는 방법은 총 몇가지인가?
	// A  4가지
	// 생성자가 4개 있으면 완벽하게 구현이 가능
	
	public Book(String title, String writer) {
		this.title = title;
		this.writer = writer;
	}
	
	public Book(String title, String writer, String publisher) {
		this.title = title;
		this.writer = writer;
		this.publisher = publisher;
	}
	
	public Book(String title, String writer, int price) {
		this.title = title;
		this.writer = writer;
		this.price = price;
	}
	public Book(String title, String writer, String publisher, int price) {
		this.title = title;
		this.writer = writer;
		this.publisher = publisher;
		this.price = price;
	}
}
