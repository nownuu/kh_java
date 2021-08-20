package condition2;
import java.lang.*;

public class Test02 {
	public static void main(String[] args) {
		
		int month = 3;
		
		switch(month){ //month의 값에 따라특정 지점으로 이동시키도록 하겠다!

		case 4:	case 6:	case 9:	case 11:
			System.out.println(30);
			break;
		case 2:
			System.out.println(28);
			break;
		default: 
			System.out.println(31);
			break;
		}
	}
}
