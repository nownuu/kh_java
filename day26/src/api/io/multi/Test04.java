package api.io.multi;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Test04 {
	public static void main(String[] args) throws IOException {
		
		List<Integer> lotto = new ArrayList<>();
		
		File target = new File("sample", "lotto.txt");
		FileInputStream in = new FileInputStream(target);
		BufferedInputStream buffer = new BufferedInputStream(in);
		DataInputStream data = new DataInputStream(buffer);
		
		for(int i=0; i < 6; i++) {
			lotto.add(data.readInt());
		}
		data.close();
		
		System.out.println(lotto);
	}
}
