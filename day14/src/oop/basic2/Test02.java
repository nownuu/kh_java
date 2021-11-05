package oop.basic2;

import java.awt.SecondaryLoop;

import oop.basic1.Message;

public class Test02 {
	public static void main(String[] args) {
		Olmpic first = new Olmpic();
		
		first.nation = "미국";
		first.gold = 39;
		first.silver = 41;
		first.bronze = 33;
		
		System.out.println(first);
		System.out.println(first.nation);
		System.out.println(first.gold);
		System.out.println(first.silver);
		System.out.println(first.bronze);
		System.out.println(first.rank);
		
		Olmpic second = new Olmpic();
		
		second.nation = "중국";
		second.gold = 38;
		second.silver = 32;
		second.bronze = 18;
		
		System.out.println(second);
		System.out.println(second.nation);
		System.out.println(second.gold);
		System.out.println(second.silver);
		System.out.println(second.bronze);
		
		Olmpic third = new Olmpic();
		
		third.nation = "일본";
		third.gold = 27;
		third.silver = 14;
		third.bronze = 17;
		
		System.out.println(third);
		System.out.println(third.nation);
		System.out.println(third.gold);
		System.out.println(third.silver);
		System.out.println(third.bronze);
		
		Olmpic forth = new Olmpic();
		
		forth .nation = "영국";
		forth .gold = 22;
		forth .silver = 21;
		forth .bronze = 22;
		
		System.out.println(forth );
		System.out.println(forth .nation);
		System.out.println(forth .gold);
		System.out.println(forth .silver);
		System.out.println(forth .bronze);
		
	
	}
}
