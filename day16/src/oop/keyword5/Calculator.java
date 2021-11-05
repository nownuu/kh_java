package oop.keyword5;

public class Calculator {
	public static int multiple(int left, int right) {
		return left*right;
	}
	public static int square(int left, int right) {
		return (int) Math.pow(left, right);
	}
	public static int triangle(int left, int right) {
		return (left*right)/2;
	}
	public static float circle(int r) {
		return (int)Math.pow(r, 2)*3.14f;
	}
	public static int random(int a, int b) {
		int n = b - a +1;
		int number = (int)(Math.random()*n)+a;
		return number;
	}
}
