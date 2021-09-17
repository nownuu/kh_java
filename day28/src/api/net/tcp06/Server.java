package api.net.tcp06;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			ServerSocket server = null;
			Socket socket = null; 
			
			try { 
				server = new ServerSocket(30000); 
				System.out.println("연결을 기다리고 있습니다.");
				socket = server.accept(); 
				System.out.println("연결되었습니다.");

				BufferedReader in
	            = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				BufferedWriter out 
	            = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));

				while (true) { 
					String inputMessage = in.readLine();
					
					if (inputMessage.equals("종료")) { 
						System.out.println("메시지 이용이 종료되었습니다.");
						break;
					}
					
					System.out.println("Client : " + inputMessage);
					System.out.print("메시지를 보냅니다.");
					
					String outputMessage = scan.nextLine();
					out.write(outputMessage + "\n"); 
					out.flush();
				}

			} catch (Exception e) {
				System.out.println(e.getMessage());
			} finally {

				try {
					scan.close();
					socket.close();
					server.close();
				} catch (Exception e2) {
					System.out.println("클라이언트와 채팅 중 오류가 발생했습니다.");
				}
			}
		}
	}
