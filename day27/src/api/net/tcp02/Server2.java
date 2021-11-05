package api.net.tcp02;

import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server2 {
	public static void main(String[] args) throws IOException {
		
		// 서버는 동시에 두개 킬 수 없음
		// 서버가 먼저 켜야함
		ServerSocket server = new ServerSocket(30000);
		Socket socket = server.accept();
		
		//Client 에게 byte 5개를 전달하는 코드
		// = socket.getOutputStream()을 활용하여 출력
		
		OutputStream out = socket.getOutputStream();
		
		out.write(104);
		out.write(101);
		out.write(108);
		out.write(108);
		out.write(111);
		
//		out.close(); // socket 닫히면 자동으로 닫혀서 필요없음.
		
		socket.close();
		server.close();
	}
}
