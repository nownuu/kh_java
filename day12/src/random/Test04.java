package random;
import java.util.Random;
import java.util.Scanner;
public class Test04 {
	public static void main(String[] args) {
		
		//확률에 맞게 랜덤으로 하나의 랜덤박스 추첨 결과를 출력
		//- 최상급 아이템 : 1%- 상급 아이템 : 5%	- 중급 아이템 : 14%- 일반 아이템 : 80%
		
		Random r = new Random();
		int random = r.nextInt(100)+1;
		System.out.println("random = " + random);
		
		if(random == 1) {
			System.out.println("최상급 아이템");
		}
			else if(random <= 6) {
				System.out.println("상급 아이템");
			}
				else if(random <= 20) {
					System.out.println("중급 아이템");
				}
					
					else {
						System.out.println("일반 아이템");
					}
				}
			}
