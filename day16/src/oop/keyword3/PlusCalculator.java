package oop.keyword3;

public class PlusCalculator {
	private int left; //필수
	private int right; // 필수
	
	public void setLeft(int left) {
		this.left = left;
	}
	public void setRight(int right) {
		this.right = right;
	}
	public int getLeft() {
		return this.left;
	}
	public int getRight() {
		return this.right;
	}
	
	public int getTotal() {
		return this.left + this.right;
	}
	
	public PlusCalculator(int left, int right) {
		this.setLeft(left);
		this.setRight(right);
	}
}
