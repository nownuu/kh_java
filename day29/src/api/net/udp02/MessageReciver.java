package api.net.udp02;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class MessageReciver {
	public static void main(String[] args) throws IOException {
		
		DatagramSocket ds = new DatagramSocket(23456);
		byte[] data = new byte[100];
	
			DatagramPacket dp = new DatagramPacket(data, data.length);
			System.out.println("Reciver Message");
			
			//수신
			ds.receive(dp);
			System.out.println("Complete Reception");
			
			// 문자열로 복원
			int size = dp.getLength();
			String text = new String(data, 0, size);
			System.out.println(text);
			
			ds.close();
	}
}
