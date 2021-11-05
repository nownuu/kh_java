package api.collection4;

import java.util.Stack;

public class Test01 {
	public static void main(String[] args) {
		//Stack과 Queue
		// Queue : 대기열. 줄을 서서 기다리는 형태. FIFO(선입선출) 구조
		// Stake : 출입구가 하나뿐이니 저장소 형태. LIFO(후입선출) 구조
		
		Stack<String> st = new Stack<>();
		
		st.push("아이유");
		st.push("문빈");
		st.push("이동욱");
		st.push("차은우");
		st.push("한지민");
		
		//System.out.println(st.pop());
		//System.out.println(st.pop());
		//System.out.println(st.pop());
		
		while(!st.empty()) {
			System.out.println(st.pop());
		}
	}
}
