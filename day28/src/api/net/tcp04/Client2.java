package api.net.tcp04;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Set;

public class Client2 {
	public static void main(String[] args) throws UnknownHostException, IOException, ClassNotFoundException {
		Socket socket = new Socket("localhost", 30000);
		
		// 서버에서 전송되는 데이터(로또번호 6개)를 수신하여 출력
		
		InputStream in = socket.getInputStream();
		BufferedInputStream buffer= new BufferedInputStream(in);
		ObjectInputStream oData = new ObjectInputStream(buffer);
		
		Set<Integer> set = (Set<Integer>) oData.readObject();
		
		socket.close();
		
		System.out.println(set);
		for(int number : set) {
			System.out.println("number"+number);
		}
	}
}
