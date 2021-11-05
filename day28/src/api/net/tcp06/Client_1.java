package api.net.tcp06;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class Client_1 {
	public static void main(String[] args) throws  IOException {
		Scanner sc = new Scanner(System.in);
		ServerSocket server = null;
		Socket socket = new Socket("localhost", 30000);
		
		InputStreamReader in = new InputStreamReader(socket.getInputStream());
		BufferedReader buffer1 = new BufferedReader(in);
		
		OutputStreamWriter out = new OutputStreamWriter(socket.getOutputStream());
		BufferedWriter buffer2 = new BufferedWriter(out);
		
		while(true) {
			System.out.println("Messege");
			String outMessage = sc.nextLine();
			if(outMessage.equals("종료")) {
				out.write(outMessage);
				out.flush();
				break;
			}
			out.write(outMessage);
			out.flush();
			
			String inMessage = buffer1.readLine();
			System.out.println("Server"+inMessage);
		}
				sc.close();
				socket.close();
			
	}
}
