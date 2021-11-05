package realnumber;
import java.lang.*;
public class Test06 {
	public static void main(String[] args) {
		
	double tall = 180;
	byte weight = 80;
	
    double  bmi = weight / (tall/100*tall/100);
	
    
    double tallA = 190;
    byte weightA = 105;
    
    double bmiA = weightA/(tallA/100*tallA/100);
    
	System.out.println(bmi);
	System.out.println(bmiA);
	
	
	}
}
