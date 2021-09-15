package api.io.single;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DecimalFormat;
import java.text.Format;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileManager {
	// 파일 관련된 처리를 수행하는 클래스
	
	//파일 복사(originFile ----> copyFile) : debug off
		public static void copyFile(File originFile, File copyFile) throws IOException {
			copyFile(originFile, copyFile, false);
		}
		
		//파일 복사(originFile ----> copyFile) : debug 선택
		public static void copyFile(File originFile, File copyFile, boolean debug) throws IOException {
			FileInputStream originFileStream = new FileInputStream(originFile);	
			FileOutputStream copyFileStream = new FileOutputStream(copyFile);
			
			//진행상황 표시
			//= 원본 파일의 byte 크기
			//= 복사 완료한 byte 크기
			Format f = new DecimalFormat("#,##0.00");
			long total = originFile.length();
			long count = 0L;
			while(true) {
				int data = originFileStream.read();
				if(data == -1) break;
				
				copyFileStream.write(data);
				if(debug) {//debug 설정이 된 경우에만 진행상황을 체크하도록 계산 코드를 실행
					count++;
					
					float percent = count * 100f / total;
					System.out.println("총 "+total+"byte 중 "+count+"byte 복사 완료("+f.format(percent)+" %)");
				}
			}
			
			//stream 종료
			originFileStream.close();
			copyFileStream.close();
		}
}
