package oop.inherit5;

public class Test01 {
	public static void main(String[] args) {
		
		MP3 f1 = new MP3();
		f1.setName("MP3 파일 이름");
		System.out.println(f1.getName());
		f1.setFileSize(3.44f);
		System.out.println("파일 사이즈 = "+f1.getFileSize());
		f1.setDuration(232);
		System.out.println("초단위 재생 = "+f1.getDuration());
		
		f1.execute();
		f1.forward();
		f1.rewind();
		
		AVI f2 = new AVI();
		f2.setName("AVI 파일이름");
		System.out.println(f2.getName());
		f2.setFileSize(3.44f);
		System.out.println("파일 사이즈 = "+f2.getFileSize());
		f2.setSpeed(1.0f);
		System.out.println("재생속도 = "+ f2.getSpeed());
		f2.execute();
		f2.forward();
		f2.rewind();
		
		PPT f3 = new PPT();
		f3.setName("PPT 파일 이름");
		System.out.println(f3.getName());
		f3.setFileSize(3.44f);
		System.out.println("파일 사이즈 = "+f3.getFileSize());
		f3.setPageSize(67);
		System.out.println("페이지 수 = "+ f3.getPageSize());
		f3.execute();
		f3.information();
	}
}
