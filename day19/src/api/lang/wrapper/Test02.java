package api.lang.wrapper;

public class Test02 {
	public static void main(String[] args) {
		//int가 있는데 Integer는 왜 필요한가?
		//int가 필요한 상황도 있고 Integer이 필요한 상황도 있다.
		
		//int가 필요한 상황 (간편하게 연산하는 상황)
		int a1 = 10;
		int a2 = 20;
		int a3 = 30;
		
		System.out.println(a3);
		
		Integer b1 = new Integer(10);
		Integer b2 = new Integer(20);
		Integer b3 = new Integer(30);
		
		System.out.println(b3.toString());
		
		//Integer이 필요한 상황 (복잡하게 연산하는 상황)
		int c = 100;
		String s ="";
		for(int i = c; i>0 ; i /=2) {
			s = i % 2 + s;
		}
		System.out.println(s);
		System.out.println(Integer.toBinaryString(c));
	}
}
