package api.net.udp02;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class MessageSender {
	public static void main(String[] args) throws IOException {
		
		DatagramSocket ds = new DatagramSocket();
		Scanner sc = new Scanner(System.in);
		
		// 데이터 준비
		System.out.println("+  Send Message  +");
		String text = sc.nextLine();
		
		//byte  변환
		byte[] data = text.getBytes(/*인코딩방식 지정 가능*/);
		
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
