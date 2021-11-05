package api.net.tcp06;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server_01 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		ServerSocket server =  new ServerSocket(30000);
		System.out.println("=====연결 중=====");
		Socket socket = server.accept();
		System.out.println("====연결 완료====");
		
		InputStreamReader in = new InputStreamReader(socket.getInputStream());
		BufferedReader buffer1 = new BufferedReader(in);
		
		OutputStreamWriter out = new OutputStreamWriter(socket.getOutputStream());
		BufferedWriter buffer2 = new BufferedWriter(out);
		PrintWriter printer = new PrintWriter(buffer2);
		
		while(true) {
			String inMessage = buffer1.readLine();
			
			if(inMessage.equals("종료")) {
				System.out.println("Message END");
				break;
			}
			
			System.out.println("Client : "+inMessage);
			System.out.println("Message");
			
			String outMessage = sc.nextLine();
			printer.println(outMessage);
			printer.flush();
			System.out.println("Finish");
		}
					sc.close();
					socket.close();
					server.close();
		}
	}
