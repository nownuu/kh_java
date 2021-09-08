package api.exception;

public class Test09 {
	public static void main(String[] args) {
		Calculator c = new Calculator();
		
		try {
		int result = c.div(-10, 0);
		
		System.out.println("result = "+result); //
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
