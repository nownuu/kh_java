package api.net.tcp08;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;


public class Server_2 {
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
			String inMessage = in.readLine();
			
			if(inMessage == null || inMessage.equals("exit")) {
				System.out.println("===END MESSAGE===");
				break;
			}
			printer.println(inMessage);
			printer.flush();
			
			System.out.println("Client [ " + inMessage+" ]");
			System.out.println("답변을 보냅니다.");
			
			switch(inMessage) {
			case "$동기부여" : printer.println("넌 언젠간 지구 최강의 개발자가 될거야!"); 
			case "$링크" : printer.println("문서사이트는 https://hiphop5782.github.io 입니다.");
			case "$화이팅" : printer.println("우리모두 화이팅");
			default : printer.println("답변이 준비되지 않았습니다.");
			}

			printer.flush();
			
			socket.close();
			server.close();
		}
	}
}
