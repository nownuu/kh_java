package oop.inherit7;

public class Test01 {
	public static void main(String[] args) {
		
		Galaxy21s p1 = new Galaxy21s("010-1213-4567", "BLACK");
		p1.call();
		p1.sms();
		p1.samsungPay();
		p1.bixby();
		
		GalaxyFold3 p2 = new GalaxyFold3("010-4567-2345", "WHITE");
		p2.call();
		p2.sms();
		p2.samsungPay();
		p2.iris();
		
		IPhone11 p3 = new IPhone11("010-5678-2344", "WHITE");
		p3.call();
		p3.sms();
		p3.siri();
		p3.itunes();
		
		IPhone12 p4 = new IPhone12("010-4567-2345", "BLACK");
		p4.call();
		p4.sms();
		p4.siri();
		p4.faceTime();
	}
}
