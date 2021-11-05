package api.net.tcp08;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		Socket socket = new Socket("localhost", 30000);
		
		
		BufferedReader in
		 = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		
		BufferedWriter out
		 = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));	
		PrintWriter printer = new PrintWriter(out);
		
		while(true) {
			System.out.println("질문을 선택하십시오");
			System.out.println("$동기부여, $링크, $화이팅");
			String outMessage = sc.nextLine();
			printer.println(outMessage);
			printer.flush();
			
			if (outMessage.equals("exit")) break;
			
			String response = in.readLine();
			System.out.println("==== Server ====");
			System.out.println(response);
			
			
			String inMessage = in.readLine();
			System.out.println("Server [ "+inMessage+" ]");
		}

		sc.close();
		socket.close();
	}
}
