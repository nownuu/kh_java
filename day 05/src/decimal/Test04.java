package decimal;

import java.lang.*;

public class Test04 {
	public static void main (String[] args) {
		
		int usersEndhour = 9, usersEndmin = 15;
		int usersStarthour = 7, usersStartmin = 50;
		
		
		int usersEndtotal = usersEndhour * 60 + usersEndmin;
		int usersStarttotal = usersStarthour * 60 + usersStartmin;
		
		int usersTotal = usersEndtotal - usersStarttotal;
		
		int usersTotalHours = usersTotal /60;
		int usersTotalMins = usersTotal %60;
		
		
		System.out.println(usersTotal);
		System.out.println(usersTotalHours);
		System.out.println(usersTotalMins);
		
		
		
		int usersPrice = 600;
		int usersTotalPrice = usersTotalHours * usersPrice  + usersTotalMins * usersPrice /60;
	
		
		System.out.println(usersTotalPrice);
	}
}
