package random;
import java.util.Scanner;
import java.util.Random;
public class Test03 {
	public static void main(String[] args) {
		// 구구단 1문제를 출제하여 정답을 입력받고 맞았는지 틀렸는지 판정
		
		// 구구단 1문제 출제
		
		System.out.println("구구단 문제를 출제합니다.");
		
		Random r = new Random();
		int multiA = r.nextInt(9)+1; // 구구단 앞숫자
		int multiB = r.nextInt(9)+1; // 구구단 뒷숫자
		
		System.out.println(multiA + " * "+ multiB +"=  ?"); // 
		int correct = multiA*multiB; // 구구단 정답
		
		System.out.println("정답을 쓰시오.");
		Scanner sc = new Scanner(System.in);
		int answer = sc.nextInt(); //정답 외치기
		sc.close();
		
		if( answer == correct) {
			System.out.println("정답입니다.");
		}
			else {
				System.out.println("오답입니다.");
				System.out.println("정답은 "+correct+"입니다.");
			}
		}
	}

