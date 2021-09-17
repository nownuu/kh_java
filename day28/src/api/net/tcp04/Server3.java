package api.net.tcp04;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Server3 {
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
		// int 6개를 보낼 수 있도록 멀티바이트 스트림을 구성
		OutputStream out = socket.getOutputStream();
		BufferedOutputStream buffer = new BufferedOutputStream(out);
		DataOutputStream data = new DataOutputStream(buffer);
		for(int number : lotto) {
			data.writeInt(number);
		}
		
		socket.close();
		server.close();
	}
}
