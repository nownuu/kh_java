package api.net.tcp04;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.util.Arrays;

public class Client {
	public static void main(String[] args) throws IOException {
		
		Socket socket = new Socket("localhost",30000);
		InputStream in = socket.getInputStream();
		int[] lotto = new int[6];
		
		
		for(int i = 0; i < lotto.length; i++) {
			lotto[i] = in.read();
		}
		System.out.println("이번주 예상 로또 번호");
		System.out.println("==================");
		System.out.println(Arrays.toString(lotto)+"입니다.");
		
		
		socket.close();
	}
}
