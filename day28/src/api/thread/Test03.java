package api.thread;

import javax.swing.JOptionPane;

public class Test03 {
	public static void main(String[] args)  throws InterruptedException {
		//스레드를 하나 생성해서 main과 병렬로 실행(멀티 스레드)
		// main에서 1부터 100까지 출력하는 코드를 실행
		// 생성한 스레드에서 입력코드를 실행
		
		//스레드(일꾼 생성)
		// Thread t = new Thread(); // 이렇게 생성함녀 뭘 해야할는 지 알 수 없다.
		Thread t = new Thread() { // 익명 클래스를 만들어서 작업을 run메소드에 재정의해준다.
			public void run() {
				String input = JOptionPane.showInputDialog("메시지 입력");
				System.out.println(input);
			}
		};
		
		//스레드(일꾼 구동)
		t.start();
		
		for(int i = 1 ; i <= 100 ; i ++) {
			System.out.println(i);
			Thread.sleep(1000L);
		}
	}
}

