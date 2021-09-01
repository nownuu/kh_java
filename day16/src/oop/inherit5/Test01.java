package oop.inherit5;

public class Test01 {
	public static void main(String[] args) {
		
		MP3 f1 = new MP3();
		f1.setName("MP3 파일 이름");
		System.out.println(f1.getName());
		
		f1.fileSize();
		f1.execute();
		f1.duration();
		f1.forward();
		f1.rewind();
		
		AVI f2 = new AVI();
		f2.setName("AVI 파일이름");
		System.out.println(f2.getName());
		
		f2.fileSize();
		f2.execute();
		f2.speed();
		f2.forward();
		f2.rewind();
		
		PPT f3 = new PPT();
		f3.setName("PPT 파일 이름");
		System.out.println(f3.getName());
		
		f3.fileSize();
		f3.execute();
		f3.pageSize();
		f3.information();
	}
}
