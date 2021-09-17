package api.net.tcp06;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Client {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		ServerSocket server = null;
		Socket socket = null; 
		
		try {
			 socket = new Socket("localhost", 30000);
			BufferedReader in 
            = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			BufferedWriter out
             = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			
			// 반복문 메시지 보내기
			while (true) { 
				System.out.print("메시지를 보냅니다."); 
				String outputMessage = scan.nextLine();
				if (outputMessage.equals("종료")) {
					out.write(outputMessage);
					out.flush(); 
					break;
				}   
				out.write(outputMessage + "\n"); 
				out.flush();
				
				String inputMessage = in.readLine();
				System.out.println("Server:" + inputMessage);
			}
			
		} catch (Exception e) {
			System.out.println(e.getMessage()); 
		} finally { 
			
			try {
				scan.close();
				socket.close();
			} catch (Exception e2) {
				System.out.println("서버와 채팅 중 오류가 발생했습니다.");
			}
		}
	}
}
