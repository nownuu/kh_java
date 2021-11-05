package oop.poly2;

import java.util.Scanner;

public class Test01 {
		
		public static final int GALAXY21S =1;
		public static final int GALAXYFOLD3 = 2;
		public static final int IPHONE11 =3;
		public static final int IPHONE12 =4;
		public static final int PHONE_START = 1;
		
		public static final int CAMARA_ACTION=1;
		public static final int  GALLERY_ACTION =2;
		public static final int  CALL_ACTION =3;
		public static final int SMS_ACTION =4;
		
		public static void amin(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("1 갤럭시");
			sc.close();
			
			int phone = GALAXY21S;
			int action = GALLERY_ACTION;
			
			Phone p;
			if(phone == GALAXY21S) {
				p = new Galaxy21s();
			}
			else if(phone == GALAXYFOLD3) {
				p = new GalaxyFold3();
			}
			else if(phone == IPHONE11) {
				p = new IPhone11();
			}
			else if(phone == IPHONE12) {
				p = new IPhone12();
			}
			else {
				p = null;
			}
			
			if(action == CAMARA_ACTION) {
				p.camera();
			}
			else if(action == GALLERY_ACTION) {
				p.gallery();
			}
			else if(action == CALL_ACTION) {
				p.call();
			}
			else if(action == SMS_ACTION) {
				p.sms();
			}
		}
	}

