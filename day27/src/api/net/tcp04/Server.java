package api.net.tcp04;

import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Server {
	public static void main(String[] args) throws IOException {
		
		ServerSocket server = new ServerSocket(30000);
		System.out.println("프로그램 실행");
		Socket socket = server.accept();
		OutputStream in = socket.getOutputStream();
		
		List<Integer> numbers = new ArrayList<>();
		for(int i = 0 ; i <= 45 ; i ++) {
			numbers.add(i);
		}
		
		Collections.shuffle(numbers);
		List<Integer> lottoList = numbers.subList(0, 6);
		Collections.sort(lottoList);
		
		for(int n : lottoList) {
			in.write(n);
		}
		
		socket.close();
		server.close();
	}
}
