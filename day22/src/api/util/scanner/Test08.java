package api.util.scanner;

import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class Test08 {
		public static void main(String[] args) throws IOException {
			//Scanner를 이용하여 홈페이지 소스 읽기
			URL url = new URL("https://www.rottentomatoes.com/");
			
			Scanner sc = new Scanner(url.openStream(), "UTF-8");
			
			while(sc.hasNextLine()) {
//				<span class="dynamic-text-list__item-title clamp clamp-1">Cinderella</span>
				String line = sc.findInLine("<span\\s*class=\"dynamic-text-list__item-title\\sclamp\\sclamp-1\">(.*?)<\\/span>");//원하는 부분
				if(line != null) {
					//System.out.println(line);
					//첫 번째 > 와 마지막 < 의 위치를 찾아서 잘라내기
					int begin = line.indexOf(">") + 1;
					int end = line.lastIndexOf("<");
					System.out.println(line.substring(begin, end));
				}
				else {
					sc.nextLine();//나머지 부분
				}
			}
			
			sc.close();
}
}