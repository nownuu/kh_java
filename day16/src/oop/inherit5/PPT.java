
package oop.inherit5;

public class PPT extends File{
	private int pageSize;
	
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public int getPageSize() {
		return pageSize;
	}
	
	public void information() {
		System.out.println("파일 정보 확인");
		System.out.println("파일명" + super.getName());
		System.out.println("파일 크기" + super.getFileSize());
		System.out.println("파일 페이지 수" + this.pageSize);
	}
}
