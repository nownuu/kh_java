package api.net.tcp02;

import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
	public static void main(String[] args) throws UnknownHostException, IOException {
		
//		Socket socket = new Socket("172.30.1.12", 30000); //내 주소
		Socket socket = new Socket("1.220.236.75", 30000); //쌤 주소
		
//		Server에서 전송되는 byte 5개를 수신하는 코드
//		= socket.getInputStream();을 활용하여 입력
		InputStream in =  socket.getInputStream();
		
		int a = in.read();
		int b = in.read();
		int c = in.read();
		int d = in.read();
		int e = in.read();
		
		socket.close();
		
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println("c = " + c);
		System.out.println("d = " + d);
		System.out.println("e = " + e);
	}
}
