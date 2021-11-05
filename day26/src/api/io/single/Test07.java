package api.io.single;

import java.io.File;
import java.io.IOException;

public class Test07 {
	public static void main(String[] args) throws IOException {
		// 디렉터리 복사
		// = 디렉터리는 크기가 없으며 단지 파일을 걷어두는 역할을 함.
		// = 디렉터리를 복사한다면 디렉터리를 만든 뒤 내용물을 복사한다.
		
		File originDirectory = new File("D:/moonlight/test");
		File copyDirectory = new File("D:/moonlight/test2");
		
		//FileManager.copyDirectory(originDirectory, copyDirectory, true);
		FileManager.copy(originDirectory, copyDirectory, true);
	}
}
