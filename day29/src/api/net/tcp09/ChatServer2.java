package api.net.tcp09;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

import javax.swing.JOptionPane;

public class ChatServer2 {
	public static void main(String[] args) throws IOException {
		ServerSocket server = new ServerSocket(30000);

		Socket socket = server.accept();

		// (수신) 클라이언트에서 보내는 메시지
		// (발신) 클라이언트로 메시지 전송

//		스레드 생성 및 구동 코드
		Runnable r = ()->{
//			발신 작업(무한반복) - /exit라고 입력하면 중지
//			1. 스트림 생성
//			2. 사용자 입력 및 네트워크 전송(출력)
			
			try {
				OutputStream out = socket.getOutputStream();
				OutputStreamWriter converter = new OutputStreamWriter(out);
				BufferedWriter buffer = new BufferedWriter(converter);
				PrintWriter printer = new PrintWriter(buffer);
				
				while(true) {
					String input = JOptionPane.showInputDialog("메시지 입력");
					if(input != null) { //입력값이 있다면 전송하도록 조건을 설정
						printer.println(input);
						printer.flush();
						
						if(input.equals("/exit")){ // 종료명령이 없다면
							break;
						}
					}
				}
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			
		};
		
		Thread t = new Thread(r);
		t.setDaemon(true);
		t.start();
		
//		수신 작업(무한반복) - /exit라고 입력하면 중지
//		1. 스트림 생성
//		2. 메시지 수신 후 출력
		
		InputStream in = socket.getInputStream();
		InputStreamReader converter = new InputStreamReader(in);
		BufferedReader buffer = new BufferedReader(converter);
		
		while(true) {
			String line = buffer.readLine();
			if(line == null || line.equals("/exit")) {
				break;
			}
			System.out.println("수신 = "+line);
		}

		socket.close();		
		server.close();
	}
}
