package oop.inherit6;

public class PPT extends File {
	
	public PPT(String fileName, long fileSize) {
		super(fileName, fileSize);
	} //부모 클래스의 생성자를 받아서 만들어줌
	
	
	public void information() {
		System.out.println("파일정보 출력");
		//protected는 자식 클래스에서 직접 접근 가능
		//this. 나 super. 둘다 가능
		System.out.println("파일이름"+this.fileName);
		System.out.println("파일크기"+super.fileSize);
	}
	
	// 3. 메소드 정의된거에서 재정의 (수정하는 것처럼 보이게 함)
	public void execute() {//this
		System.out.println("프레젠테이션을 실행합니다.");
	}
}
