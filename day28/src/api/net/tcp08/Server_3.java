package api.net.tcp08;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;


public class Server_3 {
	public static void main(String[] args) throws IOException {
		
		ServerSocket server = new ServerSocket(30000);
		System.out.println("=====WAIT=====");
		Socket socket = server.accept();
		System.out.println("===CONNECT===");
		
		BufferedReader in
		 = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		BufferedWriter out
		 = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
		PrintWriter printer = new PrintWriter(out);
		
		while(true) {
			//사용자 메세지 수신
			String line = in.readLine();
			
			//사용자가 강제로 종료하면 line == null 수신
			if(line == null || line.equals("exit")) {
				break;
			}

			//명령에 대한 응답을 CommandFactory에서 찾는다
			String text = CommandFactory.create(line);
			printer.println(text);
			printer.flush();
		}
		
//		사용자 접속 종료
		socket.close();
		
//		서버 종료
		server.close();
	}
}