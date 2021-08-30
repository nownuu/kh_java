package oop.basic3;

public class Test02 {
	public static void main(String[] args) {
		Player a = new Player();
		
		a.name = "김연아";
		a.type= "피겨스케이팅";
		a.gold = 2;
		a.silver = 0;
		a.bronze = 1;
		
		System.out.println(a);
		System.out.println(a.name);
		System.out.println(a.type);
		System.out.println(a.gold);
		System.out.println(a.silver);
		System.out.println(a.bronze);
		
		Player b = new Player();
		
		b.name = "이상화";
		b.type = "스피드스케이팅";
		b.gold = 1;
		b.silver = 2;
		b.bronze = 1;
		
		System.out.println(b);
		System.out.println(b.name);
		System.out.println(b.type);
		System.out.println(b.gold);
		System.out.println(b.silver);
		System.out.println(b.bronze);
		
		Player c = new Player();
		
		c.name = "윤성빈";
		c.type = "스켈레톤";
		c.gold = 1;
		c.silver = 0;
		c.bronze = 1;
		
		System.out.println(c);
		System.out.println(c.name);
		System.out.println(c.type);
		System.out.println(c.gold);
		System.out.println(c.silver);
		System.out.println(c.bronze);
		}
}
