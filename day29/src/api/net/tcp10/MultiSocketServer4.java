package api.net.tcp10;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashSet;
import java.util.Set;

public class MultiSocketServer4 {

	
	public static void main(String[] args) throws IOException {
		// 접속만 저장해서는 서버의 기능을 제대로 수행 할 수 없다.
		// = 우리가 만드는 서버는 사용자가 메시지를 보내면 그 메시지를 전체 사용자에게 전송해야하는 서버
		// = 모든 사용자로부터 메시지를 받을 수 있어야하고 모든 사용자에게로 메시지를 보낼 수 있어야한다.
		// = 모든 소켓마다 입출력 스트림이 존재해야한다.
		// = 소켓 + printwriter +bufferedReader가 세트로 관리되어야한다.
		// = 스레드는 연결 하나당 두개가 필요하다.
		// = main에 다 구현할 수 없으므로 socket, printwriter, bufferdreader, thread 를 묶어서 클래스로 구현
		// = Tcp User 클래스에 구현(반드시 소켓이 있어야한다. = 생성자에서 처리)
		
		
		Set<TcpUser> user = new HashSet<>(); //소켓이 메인에서 관리 되는 게 아니라 TcpUser에서 관리됨.
		
		try(ServerSocket server = new ServerSocket(30000);){
			while(true) {
				Socket socket = server.accept();
				
				TcpUser u = new TcpUser(socket);
				TcpUser.ender(u);
			}
		}
		catch(Exception e) {
//			e.printStackTrace();
			// 연결제거
			
		}
	}
}
