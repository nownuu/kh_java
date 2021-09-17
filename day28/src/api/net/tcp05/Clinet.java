package api.net.tcp05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class Clinet {
	public static void main(String[] args) throws UnknownHostException, IOException {
		Socket socket = new Socket("localhost", 30000);
		
		// 수신 or 발신 코드
//		InputStreamReader converter = new InputStreamReader(socket.getInputStream);
//		BufferedReader buffer = new BufferedReader(converter);
		
		InputStream in = socket.getInputStream();
		InputStreamReader converter = new InputStreamReader(in);
		BufferedReader buffer = new BufferedReader(converter);
		
		while(true) {
			String str = buffer.readLine();
			if(str == null) break;
			System.out.println("str = "+str);
		}
		
		socket.close();
	}
}
