package api.net.tcp04;

import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Server4 {
	public static void main(String[] args) throws IOException {
		//로또 번호 6개 추첨
		
		ServerSocket server = new ServerSocket(30000); // 서버 30000포트 개방
		Socket socket = server.accept();
		
		Random r = new Random();
		Set<Integer> lotto = new TreeSet<>();
		while(lotto.size()<6) {
			lotto.add(r.nextInt(45)+1);
		}
		
		// 사용자에게 로또번호 6개를 보내는 코드
		// int 6개를 보낼 수 있도록 멀티바이트      스트림을 구성
		OutputStream out = socket.getOutputStream();
		// 이것만 쓰는 경우는 바이트만 쓰는 경우
		
		BufferedOutputStream buffer = new BufferedOutputStream(out);
		ObjectOutputStream oData = new ObjectOutputStream(buffer);
		
		oData.writeObject(lotto);
		
		oData.flush();
		socket.close();
		server.close();
	}
}
