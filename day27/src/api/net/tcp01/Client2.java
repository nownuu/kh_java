package api.net.tcp01;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client2 {
	public static void main(String[] args) throws UnknownHostException, IOException {
		
			// 연결 생성
			Socket socket = new Socket("﻿172.30.1.12", 30000);
			System.out.println("연결 성공했습니다");
			
			System.out.println("소켓 정보" + socket);
			
			// 데이터를 주고받는 코드
			
			//연결 종료
			socket.close();
			System.out.println("서버와의 연결이 종료되었습니다.");
	}
}
