package oop.inherit3;

public class Browser {
	
	private String url;
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	
	public void refresh() {
		System.out.println("새로고침 기능 실행");
	}
	public void move() {
		System.out.println("페이지 이동");
	}
}