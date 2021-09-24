package api.net.udp03;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.net.MulticastSocket;

public class MulticastReceiver {
	public static void main(String[] args) throws IOException {
		int port = 30000;
		String channel = "224.0.0.0";
		InetAddress address = InetAddress.getByName(channel);
		
		// 도구 생성
		MulticastSocket ms = new MulticastSocket(port);
		
		// 채널 참여
//		ms.joinGroup("주소 객체");
		ms.joinGroup(address);
		
		// 데이터 수신 준비
		byte[] data = new byte[100];
		DatagramPacket dp = new DatagramPacket(data, data.length);
		
		ms.receive(dp);
		
		//복원
		String text = new String(dp.getData(),0,dp.getLength());
		System.out.println("text = "+text);
		
		ms.close();
	}
}
