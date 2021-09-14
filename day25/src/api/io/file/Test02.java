package api.io.file;

import java.io.File;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test02 {
	public static void main(String[] args) {
		File f = new File("sample","test.txt");
		System.out.println(f.exists());
		
		// 파일 정보 분석
		//1. 파일명
		System.out.println(f.getName());
		
		// 2. 파일 위치(경로)
		// 상대 경로 = 특정 지점을 기준으로 계산한 경로를 의미
		// 절대 경로 = 어떠한 경우에도 변하지 않는 경로를 의미
		System.out.println(f.getPath()); // 상대 경로
		System.out.println(f.getAbsolutePath()); // 절대 경로
		
		//3. 파일 크기(반환형이 long임을 주의해야한다.)
		System.out.println(f.length());
		
		//4. 최종 수정 시각
		System.out.println(f.lastModified());
		Date d = new Date(f.lastModified());
		Format form = new SimpleDateFormat("yy-MM-dd E a hh:mm:ss");
		System.out.println(form.format(d));
		
		//5. 숨김 파일인지 확인
		System.out.println(f.isHidden());
		//6. 읽기 전용인지 확인
		System.out.println(f.canRead());
		//7. 쓰기 전용인지 확인
		System.out.println(f.canWrite());
	}
}
