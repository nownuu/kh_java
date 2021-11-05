package condition;
import java.lang.*;
import java.util.Scanner;
public class Test04 {
	public static void main(String[] args) {
		// 지하철 무임승차 대상인가?
		//= 65세 이상 어르신은 무임승차 대상
		//= 7세 이하 유아는 무임승차 대상
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이는? ");
		int age = sc.nextInt();
		
		boolean noage = 7>=age||age>65;
		
		if(noage) {
			System.out.println("무임승차 가능");
		}
		if(!noage){
			System.out.println("돈을 내라");
		}
	}
}
