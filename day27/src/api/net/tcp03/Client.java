package api.net.tcp03;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class Client {
	public static void main(String[] args) throws  IOException {
		
		//서버에 접속해서 전송되는 이미지를 다운받아 저장
		// = TCP 연결
		// = 파일 출력(싱글바이트)
		
		Socket socket = new Socket("1.220.236.75", 30000);
		// 파일을 내려받는 코드
		// 버퍼의 크기를 8192로 정하고 수신하여 저장
		InputStream in = socket.getInputStream();
		BufferedInputStream buffer = new BufferedInputStream(in);
		byte[] data = new byte[8192];
		
		File dir = new File("download");
		dir.mkdirs();
		File target = new File(dir, "lion.gif");
		OutputStream out = new FileOutputStream(target);
		
		while(true) {
			int size =  in.read();
			if(size == -1) break;
			// 파일 출력 코드
			out.write(data, 0, size);
		}
		
		socket.close();
		out.close();
	}
}
