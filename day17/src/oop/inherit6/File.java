package oop.inherit6;

// File 과 같은 "슈퍼클래스"에서 구성요소를 만들 떼 고려해야할 사항
// 1.변수를 만들 때 고려해야할 사항
// → private 설정 시 "자식 클래스"가 접근할 수 없음
//→ protected 설정 시 "자식 클래스"는 제한 없이 접근 할 수 있음
// 3. 메소드를 만들 때 고려해야할 사항
//→ 재정의 (Override) [= 중복정의] 여부를 고려해야 한다.
//→ 재정의를 금지시킬 경우 final 키워드를 사용한다.
//2. 생성자를 만들 때 고려해야할 사항
//→ 객체 생성을 위한 데이터 설정(초기화)를 수행하는 
//→ 자식 클래스에서도 부모 클래스 생성자를 맞춰야 함

public class File {
	//변수
	protected String fileName;
	protected long fileSize;
	
	//생성자

	public File(String fileName, long fileSize) {
		this.setFileName(fileName);
		this.setFileSize(fileSize);
	}
	
	//메소드
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public long getFileSize() {
		return fileSize;
	}
	public void setFileSize(long fileSize) {
		this.fileSize = fileSize;
	}
	
	//3. 메소드 정의
		public void execute() {//super
			System.out.println("파일을 실행합니다.");
		}
}
