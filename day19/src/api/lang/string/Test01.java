package api.lang.string;

public class Test01 {
	public static void main(String[] args) {
		
		String a = new String("Hello World");
		String b = new String("hello World");
		
		System.out.println(a.length());
		System.out.println(b.length());
		
		System.out.println(a.charAt(3));
		
		System.out.println(a.equals(b));
		
		System.out.println(a.equalsIgnoreCase(b));
	}
}
