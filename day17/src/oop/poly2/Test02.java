package oop.poly2;

public class Test02 {
	public static void main(String[] args) {
		
		Galaxy21s a = new Galaxy21s ();
		a.call();
		a.sms();
		a.gallery();
		a.camera();
		
		GalaxyFold3 b = new GalaxyFold3 ();
		b.call();
		b.camera();
		b.sms();
		b.gallery();
		
		IPhone11 c = new IPhone11();
		c.call();
		c.camera();
		c.sms();
		c.gallery();
		
		IPhone12 d = new IPhone12();
		d.call();
		d.camera();
		d.sms();
		d.gallery();
		
	}
}
