package api.io.string;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Test04 {	
	public static void main(String[] args) throws IOException {
		
		String str = "안녕 JAVA!";
		
		File target = new File("sample","string.kh");
		FileWriter out = new FileWriter(target);
		
		out.write(str);
		out.write(str);
		out.write(str);
		
		//out.flusth();
		out.close();
	}
}
