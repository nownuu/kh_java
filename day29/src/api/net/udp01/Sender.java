package api.net.udp01;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class Sender {
	public static void main(String[] args) throws IOException {
		//UDP 통신
		// = 비연결형 프로토콜(통신 방식)
		// = 서버와 클라이언트의 개념이 없다.
		// = 보내는 주체(Sender)와 받는 주체(Receiver)만이 존재한다.
		// = 크기 제한이 존재한다.(크기는 정하기 나름)
		
		//사용되는 클래스 : DatagramSocket, DatagramPacket
		
		// 보내는 쪽에서는 전송을 위한 도구와 데이터를 준비
		DatagramSocket ds = new DatagramSocket();
		
		// 데이터를 준비해서 ds를 이용하여 전송
		String text = "Hello UDP"; // 9byte
		
		// 준비한 데이터를 byte로 전환
		byte[] data = text.getBytes();
		
//		DatagramPacket dp = new DatagramPacket(보내는 데이터, 보내는 크기, 주소객체, 포트번호);
//		DatagramPacket dp = new DatagramPacket(data, text.length(), "localhost", 30000);
		
		InetAddress address = InetAddress.getByName("localhost");
		System.out.println(address); // localhost/127.0.0.1
		DatagramPacket dp = new DatagramPacket(data, data.length, address, 30000);
		
		// 전송코드
		ds.send(dp);
		System.out.println("전송완료");
		
		// 정리코드
		ds.close();
		System.out.println("사용완료");
	}
}
