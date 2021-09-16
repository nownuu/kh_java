package api.net.tcp01;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Server3 {
	public static void main(String[] args) throws IOException {
		
//		서버를 30000번 포트에서 구동되도록 생성
		ServerSocket server = new ServerSocket(30000);
		System.out.println("서버가 구동되었습니다");
		
//		사용자가 접속할 때까지 기다린 뒤 접속정보를 socket 형태로 관리
		Socket socket = server.accept();
		System.out.println("서버에 클라이언트가 접속했습니다");
		System.out.println("소켓정보 : " + socket.toString());
		
//		데이터를 주고받는 코드
		
//		다 사용한 자원들을 정리
		socket.close();//사용자 1명과의 연결을 종료
		System.out.println("사용자와의 연결을 종료하였습니다");
		
		server.close();//서버를 중지
		System.out.println("서버를 중지하였습니다");
	}
}



