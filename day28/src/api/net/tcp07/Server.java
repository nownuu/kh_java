package api.net.tcp07;

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

//목표 : 에코서버(Echo server) , 사용자가 보낸 메세지를 그대로 반환하는 서버
public class Server {
	public static void main(String[] args) throws IOException {
	
		ServerSocket server = new ServerSocket(30000);
		
		Socket socket = server.accept();
		
		// 수신과 발신을 위한 스트림을 모두 준비해한다.
		// = 수신 후 바로 전송이 가능
		
		// 수신용 스트림
		InputStream in = socket.getInputStream();
		InputStreamReader converter = new InputStreamReader(in);
		BufferedReader inbuffer = new BufferedReader(converter);
		
		// 발신용 스트림
		OutputStream out = socket.getOutputStream();
		OutputStreamWriter converter2 = new OutputStreamWriter(out);
		BufferedWriter outbuffer = new BufferedWriter(converter2);
		PrintWriter printer = new PrintWriter(outbuffer);
		
		// 메세지 수신 후 바로 발신
		String line = inbuffer.readLine();
		printer.println(line);
		printer.flush(); // 받은거 바로 반사
		
		socket.close();
		server.close();
	}
}
