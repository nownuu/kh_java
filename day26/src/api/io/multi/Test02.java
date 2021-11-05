package api.io.multi;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class Test02 {
	public static void main(String[] args) throws IOException{
		//Multi - byte 입력
		// 준비물 :
		// - 조립도구(DataInputStream)
		// - 버퍼(BufferedInputStream)
		// - 입력(FileInputStream)
		
		// 도구 생성
		
		File target = new File("sample", "multi.txt");
		FileInputStream in = new FileInputStream(target);
		BufferedInputStream buffer = new BufferedInputStream(in); //8192byte
		DataInputStream data = new DataInputStream(buffer);
		
		// [프로그램] <- data <- buffer <- in <- target <-[multi.txt]
		
		int a = data.readInt();
		double b =data.readDouble();
		float c = data.readFloat();
		char d =data.readChar();
		byte e =data.readByte();
		short f = data.readShort();
		long g = data.readLong();
		boolean h = data.readBoolean();
		
		//통로 정리
		data.close();
		
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		System.out.println("c = "+c);
		System.out.println("d = "+d);
		System.out.println("e = "+e);
		System.out.println("f = "+f);
		System.out.println("g ="+g);
		System.out.println("h = "+h);
	}
}
