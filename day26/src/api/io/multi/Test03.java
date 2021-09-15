package api.io.multi;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test03 {
	public static void main(String[] args) throws IOException {
		//로또 번호 6개를 추첨하여 오름차순으로 정렬한 뒤 sample/lotto.txt 로 저장
		
		List<Integer> numbers = new ArrayList<>();
		for(int i = 0; i <=45; i ++) {
			numbers.add(i);
		}
		
		Collections.shuffle(numbers);
		List<Integer> partlist = numbers.subList(0, 6);
		Collections.sort(partlist);
		
		System.out.println(partlist);
		
		// 멀티 바이트 출력
		
		File target = new File("sample", "lotto.txt");
		FileOutputStream out = new FileOutputStream(target);
		BufferedOutputStream buffer = new BufferedOutputStream(out);
		DataOutputStream data = new DataOutputStream(buffer);
		
		for(int n : partlist) {
			data.writeInt(n);
		}
		data.close();
	}
}
