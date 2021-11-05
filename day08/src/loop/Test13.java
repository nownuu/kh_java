package loop;

public class Test13 {
	public static void main(String[] args) {
		
		long money = 0L;
		long total = 0L;
		
		for(int i = 1; i <=30 ; i ++) {
			if(i == 1) {
				money += 1;
				System.out.println(i +"일에 받게 되는 돈 = "+money+"만원");
			}
			else {
				money *=2;
				System.out.println(i +"일에 받게 되는 돈 = "+money+"만원");
				
				total +=money;
			}
		}
		System.out.println("30일 동안 받게 되는 돈 = " + total+"만원");
	
		for(int i = 1; i <=40 ; i ++) {
			if(i == 1) {
				money += 1;
				}
			else {
				money *=2;
				total +=money;
			}
		}
		System.out.println("40일 동안 받게 되는 돈 = " + total+"만원");
	}
}