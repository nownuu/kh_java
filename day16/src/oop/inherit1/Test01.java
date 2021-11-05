package oop.inherit1;

public class Test01 {
	public static void main(String[] args) {
	Galaxy p1 = new Galaxy();
	p1.setNumber("010-1212-3434");
	p1.call();
	p1.sms();
	p1.gallery();
	p1.voiceRecord();
	p1.samsungPay();
	
	Iphone p2 = new Iphone();
	p2.call();
	p2.sms();
	p2.gallery();
	p2.siri();
	p2.itunes();
	
	}
}
