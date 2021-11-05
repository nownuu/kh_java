package oop.basic1;
// 메시지 클래스 : 프로그래밍 내에서 메시지라는 형태의 데이터를 사용하기 위해 컴퓨터에게 알려주는 용도
// 메시지 = 닉네임 + 본문 + 보낸 시각
// 클래스는 객체를 만들기 위한 준비물 ( 설계도 )
public class Message {

		// << 멤버 변수 >>
		// 메시지에 들어있어야 하는 정보들을 변수로 선언
		// 정보에 설정될 데이터는 만들어지는 시점에 알 수 있으므로 특별한 경우가 아니라면 설정하지 않는다.
		
		String nickname;
		String content;
		String sendTime;
		
}
