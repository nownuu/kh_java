package api.collection4;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Test03 {
	public static void main(String[] args) {
		//Queue : FIFO(선입선출) 저장소
		// 등록한 순서대로 추출이 가능하므로 작업 순서등을 설정할때 유리
		Queue <String> q = new ArrayBlockingQueue<>(10);
		
		q.add("아이유");
		q.add("공유");
		q.add("문빈");
		q.add("한지민");
		q.add("전지현");
		
		System.out.println(q.poll());
	}
}
