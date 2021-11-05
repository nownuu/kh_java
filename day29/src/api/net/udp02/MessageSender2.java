package api.net.udp02;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class MessageSender2 {
	public static void main(String[] args) throws IOException {
		
		DatagramSocket ds = new DatagramSocket();
		Scanner sc = new Scanner(System.in);
		
		// 데이터 준비
		System.out.println("+  Send Message  +");
		String text = sc.nextLine();
		
		//byte  변환
		byte[] data = text.getBytes(/*인코딩방식 지정 가능*/);
		
		//100byte가 넘는지 검사
				final int LIMIT = 100;
				if(data.length > LIMIT) {
					System.err.println("100byte를 초과하는 데이터는 전송할 수 없습니다.");
					//continue;//break;//return;
					System.exit(-1);
					
					//throw new RuntimeException();//RuntimeException은 "실행중 발생한"이라는 의미의 예외
				}
		
		// 전송을 위한 그릇(DatagramPacket)준비
		InetAddress address = InetAddress.getByName("localhost"); // 주소 검사 및 분석 객체
		DatagramPacket dp = new DatagramPacket(data, data.length, address, 23456);
		
		ds.send(dp);
		System.out.println("Complete Send");
		
		ds.close();
		sc.close();
		System.out.println("Send Message End");
	}
}
