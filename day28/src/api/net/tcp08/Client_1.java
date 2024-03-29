package api.net.tcp08;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

public class Client_1 {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		Socket socket = new Socket("localhost", 30000);
		
		
		BufferedReader in
		 = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		
		BufferedWriter out
		 = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));	
		PrintWriter printer = new PrintWriter(out);
		
		while(true) {
			System.out.print("명령 : ");
			String input = sc.nextLine();//키보드 입력
			printer.println(input);//메세지 출력
			printer.flush();
			
			if(input.equals("exit")) break;//exit 입력 시 서버에게 알린 후 응답 수신하지 말고 종료
			
			String response = in.readLine();//응답 수신
			System.out.println("<서버응답>");
			System.out.println(response);
		}
		
		
		sc.close();
		
//		연결 종료
		socket.close();
	}
}
